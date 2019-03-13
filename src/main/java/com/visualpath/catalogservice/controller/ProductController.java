package com.visualpath.catalogservice.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.visualpath.catalogservice.product.Product;
import com.visualpath.catalogservice.service.ProductService;
@CrossOrigin(origins ="*")
@RestController
public class ProductController {

	@Autowired
	ProductService prodService;
	
	@GetMapping("/products")
	@PreAuthorize("hasRole('ROLE_USER')")
	public List<Product> getProducts(Principal principal)
	{
		System.out.println("***********"+principal.getName());
		return prodService.getProducts();
	}
	@RequestMapping(value = "/product/{id}", method =RequestMethod.GET)	
	public Product getProductByID(@PathVariable("id") long id) {
		return prodService.getProductByID(id);		
		
	}
}
