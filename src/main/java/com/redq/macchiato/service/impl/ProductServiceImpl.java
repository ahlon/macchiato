package com.redq.macchiato.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redq.macchiato.entity.product.Product;
import com.redq.macchiato.repository.ProductRepository;
import com.redq.macchiato.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void delete(Long productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public Product findById(Long productId) {
		return productRepository.findById(productId).get();
	}

	@Override
	public List<Product> search() {
		// TODO Auto-generated method stub
		return null;
	}

}
