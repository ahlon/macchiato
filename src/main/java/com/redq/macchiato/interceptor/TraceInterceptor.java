package com.redq.macchiato.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.redq.macchiato.entity.user.UserTrace;
import com.redq.macchiato.repository.UserTraceRepository;
import com.redq.macchiato.util.LoggerUtils;

public class TraceInterceptor implements HandlerInterceptor {
	// 请求开始时间标识
	private static final String REQUEST_TIME = "_requset_time";
	// 请求日志实体标识
	private static final String TRACE_ENTITY = "_logger_entity";

	/**
	 * 进入SpringMVC的Controller之前开始记录日志实体
	 * 
	 * @param request
	 *            请求对象
	 * @param response
	 *            响应对象
	 * @param o
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
		// 创建日志实体
		UserTrace trace = new UserTrace();
		// 获取请求sessionId
		String sessionId = request.getRequestedSessionId();
		// 请求路径
		String url = request.getRequestURI();
		// 获取请求参数信息
		String params = JSON.toJSONString(request.getParameterMap(),
				SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue);
		// 设置客户端ip
		trace.setClientIp(LoggerUtils.getCliectIp(request));
		// 设置请求方法
		trace.setMethod(request.getMethod());
		// 设置请求类型（json|普通请求）
		trace.setType(LoggerUtils.getRequestType(request));
		// 设置请求参数内容json字符串
		trace.setParams(params);
		// 设置请求地址
		trace.setUri(url);
		// 设置sessionId
		trace.setSessionId(sessionId);
		// 设置请求开始时间
		request.setAttribute(REQUEST_TIME, System.currentTimeMillis());
		// 设置请求实体到request内，方面afterCompletion方法调用
		request.setAttribute(TRACE_ENTITY, trace);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e)
			throws Exception {
		// 获取请求错误码
		int status = response.getStatus();
		// 当前时间
		long currentTime = System.currentTimeMillis();
		// 请求开始时间
		long requestTime = Long.valueOf(request.getAttribute(REQUEST_TIME).toString());
		// 获取本次请求日志实体
		UserTrace trace = (UserTrace) request.getAttribute(TRACE_ENTITY);
		// 设置请求开始的时间
		trace.setRequestTime(new Date(requestTime));
		// 设置返回时间
		trace.setReturnTime(new Date(currentTime));
		// 设置请求时间差
		trace.setConsumingTime(Integer.valueOf((currentTime - requestTime) + ""));
		// 设置返回错误码
		trace.setHttpStatusCode(status + "");
		// 设置返回值
		trace.setReturnData(JSON.toJSONString(request.getAttribute(LoggerUtils.LOGGER_RETURN),
				SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue));
		// 执行将日志写入数据库
		UserTraceRepository userTraceRepo = getDAO(UserTraceRepository.class, request);
		userTraceRepo.save(trace);
	}

	/**
	 * 根据传入的类型获取spring管理的对应dao
	 * 
	 * @param clazz
	 *            类型
	 * @param request
	 *            请求对象
	 * @param <T>
	 * @return
	 */
	private <T> T getDAO(Class<T> clazz, HttpServletRequest request) {
		BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		return factory.getBean(clazz);
	}
}
