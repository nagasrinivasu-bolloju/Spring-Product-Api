package com.example.SpringserviceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring.Dto.ProductDto;
import com.example.Spring.Repo.ProRepository;
import com.example.Spring.entity.Product;

@Service
public class ProductService
{
	@Autowired
	ProRepository cRepo;
	
	public List<Product> getAllRecords()
	{
		return cRepo.findAll();
	}

	public ProductDto getSingleRecord(Integer id)
	{
		Optional<Product> c=cRepo.findById(id);
		Product p=c.get();
		return new ProductDto(p.getProId(),p.getName());
	}

	public Product saveRecord(ProductDto product)
	{
		Product p=new Product(product.getProId(),product.getName());
		return cRepo.save(p);
	}

	public Product updateRecord(ProductDto product)
	{
		Optional<Product> c=cRepo.findById(product.getProId());
		Product p=c.get();
		p.setName(product.getName());
		return cRepo.save(p);
	}

	public void deleteRecord(Integer id)
	{
		cRepo.delete(cRepo.findById(id).get());  //findById() returns object of Optional class. 
	}
	
}
