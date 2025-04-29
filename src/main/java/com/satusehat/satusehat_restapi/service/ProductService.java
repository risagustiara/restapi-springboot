package com.satusehat.satusehat_restapi.service;

import java.util.List;

import com.satusehat.satusehat_restapi.domain.Products;

public interface ProductService {
	
	List<Products> findAll();
	
	Products findById(Long productId);
	
	Products update(Long productId, Products products);
	
	Products create(Products products);
	
	void delete(Long productId);
}
