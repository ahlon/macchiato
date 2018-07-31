package com.redq.macchiato.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.redq.macchiato.controller.form.UserSearchForm;
import com.redq.macchiato.entity.user.QUser;
import com.redq.macchiato.entity.user.User;
import com.redq.macchiato.repository.UserRepository;
import com.redq.macchiato.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private EntityManager entityManager;

	// JPA查询工厂
	private JPAQueryFactory queryFactory;

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initFactory() {
		queryFactory = new JPAQueryFactory(entityManager);
		System.out.println("init JPAQueryFactory successfully");
	}

	@Override
	public User save(User user) {
		user.setCreatedAt(new Date());
		return userRepository.save(user);
	}

	@Override
	@Transactional
	public User update(User user) {
		QUser _Q_user = QUser.user;
		queryFactory.update(_Q_user)// 更新对象
				// 更新字段列表
				.set(_Q_user.username, user.getUsername())
				// 更新条件
				.where(_Q_user.id.eq(user.getId()))
				// 执行更新
				.execute();
		return userRepository.findById(user.getId()).get();
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<User> findUsersByUsername(String username) {
		User condition = new User();
		condition.setUsername(username);

		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("username", GenericPropertyMatchers.startsWith()); // 姓名采用“开始匹配”的方式查询

		Example<User> ex = Example.of(condition, matcher);

		return userRepository.findAll(ex);

	}

	@Override
	public User findUserById(Long id) {
		QUser _Q_user = QUser.user;

		// return queryFactory.selectFrom(_Q_user) // 查询源
		// .where(_Q_user.id.eq(id)) // 指定查询具体id的数据
		// .fetchOne(); // 执行查询并返回单个结果

		return userRepository.findOne(_Q_user.id.eq(id)).get();
	}

	@Override
	public List<User> search(UserSearchForm form, Pageable pager) {
		QUser _Q_user = QUser.user;
		
        Predicate predicate = _Q_user.username.like(form.getUsername() + "%")
                .and(_Q_user._super.createdAt.gt(form.getCreatedAtFrom()))
                .and(_Q_user._super.createdAt.lt(form.getCreatedAtTo()));

//		Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC,"id"));
//		PageRequest pageRequest = new PageRequest(0,10,sort);
		
		return Lists.newArrayList(userRepository.findAll(predicate, pager));
	}

	@Override
	public List<User> list() {
		return userRepository.findAll();
	}
	
}
