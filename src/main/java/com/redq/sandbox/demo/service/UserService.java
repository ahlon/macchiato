package com.redq.sandbox.demo.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.redq.sandbox.demo.controller.form.UserSearchForm;
import com.redq.sandbox.demo.entity.user.User;

public interface UserService {
	
	User save(User user);

	User update(User user);
	
	User findUserById(Long id);

	void deleteById(Long id);

	List<User> findUsersByUsername(String username);

	List<User> search(UserSearchForm form, Pageable pager);

	List<User> list();
	
}
