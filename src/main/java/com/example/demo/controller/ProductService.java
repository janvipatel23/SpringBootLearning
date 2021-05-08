package com.example.demo.controller;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;  

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService implements IProductService
{
	// creating an object of array list
	static ArrayList<Product> products = new ArrayList<Product>();
	static {
		// adding products to array list 
		products.add(new Product(100, "Mobile", "CLK98123", 9000.00, 6));  
		products.add(new Product(101, "Smart TV", "LGST09167", 60000.00, 3));  
		products.add(new Product(102, "Washing Machine", "38753BK9", 9000.00, 7));  
		products.add(new Product(103, "Laptop", "LHP29OCP", 24000.00, 1));
	}
	
	@Override
	public List<Product> findAll()
	{		
		//returns a list of product  
		return products;
	}
	
	@Override
	public Product addItem(Product product)
	{
		// creating an object of array list
		Product productResponse = new Product();
		productResponse.setId(product.getId());
		productResponse.setPname(product.getPname());
		productResponse.setBatchno(product.getBatchno());
		productResponse.setPrice(product.getPrice());
		productResponse.setNoofproduct(product.getNoofproduct());
		System.out.println(productResponse.getPname());
		return productResponse;
	}
	
	@Override
	public void deleteItem(int id) {
		Optional<Product> deletedItem =  products.stream().filter(p -> p.getId() == id).findFirst();
		if(deletedItem.isPresent())
		{
			Product del = deletedItem.get();
			products.remove(del);
		}
	}
}
