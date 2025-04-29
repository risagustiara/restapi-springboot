package com.satusehat.satusehat_restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satusehat.satusehat_restapi.domain.Products;
import com.satusehat.satusehat_restapi.repository.ProductRepository;
import com.satusehat.satusehat_restapi.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Products findById(Long productId) {
		// TODO Auto-generated method stub
		return productRepository.getOne(productId);
	}

	@Override
	public Products update(Long productId, Products products) {
		// TODO Auto-generated method stub
		products.getProductId();
		return productRepository.save(products);
	}

	@Override
	public Products create(Products products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}

	@Override
	public void delete(Long productId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
	}

}
