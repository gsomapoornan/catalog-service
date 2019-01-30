package com.visualpath.catalogservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visualpath.catalogservice.product.Product;
import com.visualpath.catalogservice.repository.ProductCRUDRepository;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductCRUDRepository prodRepo;
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return (List<Product>) prodRepo.findAll();
	}
	@Override
	public Product getProductByID(long id) {
		// TODO Auto-generated method stub
		return prodRepo.findById(id).get();
	}

}
