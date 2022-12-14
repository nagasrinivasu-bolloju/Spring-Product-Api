package com.example.Spring.Dto;

public class ProductDto
{
	Integer proId;
	String name;
	
	public ProductDto()
	{
		 
	}
	public ProductDto(Integer proId, String name)
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
