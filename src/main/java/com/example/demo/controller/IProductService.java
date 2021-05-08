package com.example.demo.controller;
import java.util.List;

import com.example.demo.model.Product;  

public interface IProductService {
	List<Product> findAll();
	Product addItem(Product product);
	void deleteItem(int id);
}
