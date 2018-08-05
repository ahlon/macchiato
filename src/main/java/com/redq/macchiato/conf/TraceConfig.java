package com.redq.macchiato.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.redq.macchiato.interceptor.TraceInterceptor;

@Configuration
public class TraceConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TraceInterceptor()).addPathPatterns("/**");
	}
}
