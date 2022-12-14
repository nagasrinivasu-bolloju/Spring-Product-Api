package com.example.Spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product
{
	@Id
	Integer proId;
	String name;
	
	public Product()
	{
		
	}
	public Product(Integer proId, String name)
	{
		this.proId = proId;
		this.name = name;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
