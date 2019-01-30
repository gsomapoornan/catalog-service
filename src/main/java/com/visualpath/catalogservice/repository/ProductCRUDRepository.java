package com.visualpath.catalogservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.visualpath.catalogservice.product.Product;

public interface ProductCRUDRepository extends CrudRepository<Product, Long> {	
	   
}
