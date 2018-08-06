package com.redq.macchiato.service;

import java.util.List;

import com.redq.macchiato.entity.product.Product;

public interface ProductService {
	
	Product save(Product product);
	
	Product update(Product product);
	
	void delete(Long productId);
	
	Product findById(Long productId);
	
	List<Product> search();
	
}
