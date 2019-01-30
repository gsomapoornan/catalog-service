package com.visualpath.catalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.visualpath.catalogservice.product.Product;
import com.visualpath.catalogservice.service.ProductService;

@RestController
@CrossOrigin(origins ="*")
public class ProductController {

	@Autowired
	ProductService prodService;
	
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return prodService.getProducts();
	}
	@RequestMapping(value = "/product/{id}", method =RequestMethod.GET)	
	public Product getUserByID(@PathVariable("id") long id) {
		return prodService.getProductByID(id);		
		
	}
}
