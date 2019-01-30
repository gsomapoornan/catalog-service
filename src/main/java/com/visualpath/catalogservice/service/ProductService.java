package com.visualpath.catalogservice.service;

import java.util.List;

import com.visualpath.catalogservice.product.Product;

public interface ProductService {

	public List<Product> getProducts();

	public Product getProductByID(long id);
}
