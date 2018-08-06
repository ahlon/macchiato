package com.redq.macchiato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redq.macchiato.entity.product.Product;
import com.redq.macchiato.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/search")
	public List<Product> search() {
		return productService.search();
	}
	
	@GetMapping("/view")
	public Product view(Long id) {
		return productService.findById(id);
	}
	
}
