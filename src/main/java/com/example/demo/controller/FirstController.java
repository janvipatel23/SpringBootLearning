package com.example.demo.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class FirstController {
	@Autowired
	private IProductService productService;
	
	// getting the product
	@GetMapping(value = "/product")
	public List<Product> getProduct()
	{
		// finds all the products
		List<Product> products = productService.findAll();
		
		// returns list of product
		return products;
	}
	
	// adding the product
	@PostMapping(value = "/addProduct", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Product addProduct(@RequestBody Product product)
	{
		System.out.println("Id" + product.getId());
		Product addedProduct = productService.addItem(product);
		// returns new added product
		return addedProduct;
	}
	
	@DeleteMapping(value = "/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") int id)
	{
		System.out.println("Id" + id);
		productService.deleteItem(id);
	}
}
