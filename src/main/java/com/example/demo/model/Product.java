package com.example.demo.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	@JsonProperty("id")
	private int id;
	@JsonProperty("pname")
	private String pname;
	@JsonProperty("batchno")
	private String batchno;
	@JsonProperty("price")
	private double price;
	@JsonProperty("noofproduct")
	private int noofproduct;
	
	// default constructor
	public Product()
	{
		
	}
	
	// constructor using fields
	public Product(int id, String pname, String batchno, double price, int noofproduct)
	{
		this.id = id;
		this.pname = pname;  
		this.batchno = batchno;  
		this.price = price;  
		this.noofproduct = noofproduct;  
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPname()   
	{  
	return pname;  
	} 
	
	public void setPname(String pname)   
	{  
		this.pname = pname;  
	}  
	
	public String getBatchno()   
	{  
	return batchno;  
	}  
	
	public void setBatchno(String batchno)   
	{  
		this.batchno = batchno;  
	} 
	
	public double getPrice()   
	{  
	return price;  
	}  
	
	public void setPrice(double price)   
	{  
		this.price = price;  
	}  
	
	public int getNoofproduct()   
	{  
	return noofproduct;  
	}  
	
	public void setNoofproduct(int noofproduct)   
	{  
		this.noofproduct = noofproduct;  
	}  
}
