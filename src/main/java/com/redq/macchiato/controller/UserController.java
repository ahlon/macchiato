package com.redq.macchiato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redq.macchiato.controller.form.UserSearchForm;
import com.redq.macchiato.entity.user.User;
import com.redq.macchiato.service.UserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User save(User user) {
		return userService.save(user);
	}
	
	@PostMapping("/update")
	public User update(User user) {
		return userService.update(user);
	}
	
	@PostMapping("/delete")
	public void delete(Long id) {
		userService.deleteById(id);
	}
	
	@GetMapping("/view")
	public User findUserById(Long id) {
		return userService.findUserById(id);
	}

	@GetMapping("/find-by-username")
	public List<User> findUsersByUsername(String username) {
		return userService.findUsersByUsername(username);
	}

	@GetMapping("/list")
	public List<User> list() {
		return userService.list();
	}
	
	@PostMapping("/search")
	public List<User> search(@ModelAttribute UserSearchForm form, Pageable pager) {
		return userService.search(form, pager);
	}
	
}
