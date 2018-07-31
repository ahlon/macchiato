package com.redq.macchiato.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.redq.macchiato.controller.form.UserSearchForm;
import com.redq.macchiato.entity.user.User;

public interface UserService {
	
	User save(User user);

	User update(User user);
	
	User findUserById(Long id);

	void deleteById(Long id);

	List<User> findUsersByUsername(String username);

	List<User> search(UserSearchForm form, Pageable pager);

	List<User> list();
	
}
