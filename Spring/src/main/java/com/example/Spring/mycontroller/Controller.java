package com.example.Spring.mycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring.Dto.ProductDto;
import com.example.Spring.entity.Product;
import com.example.Spring.serviceLayer.ProductService;

 
@RestController
public class Controller
{
	@Autowired
	ProductService service;
	
	@GetMapping("/get-all-records")
	public List<Product> getData()
	{
		return service.getAllRecords();
	}
	
	@GetMapping("/get-record")
	public ProductDto getrecord(@RequestBody ProductDto product)
	{
		return service.getSingleRecord(product.getProId());
	}
	
	@GetMapping("/get-record-by-params")
	public ProductDto getRecord(@RequestParam("id") Integer id)
	{
		return service.getSingleRecord(id);
	}
	
	@GetMapping("/get-record-by-pathvariable/{id}")
	public ProductDto getRecordByPath(@PathVariable("id") Integer id)
	{
		return service.getSingleRecord(id);
	}
	
	@PostMapping("/post")
	public Product postData(@RequestBody ProductDto product)
	{
		return service.saveRecord(product);
	}
	
	@PutMapping("/update-record")
	public Product updateCust(@RequestBody ProductDto product)
	{
		return service.updateRecord(product);
	}
	
	@DeleteMapping("/delete-record")
	public void delete(@RequestParam("id") Integer id)
	{
		service.deleteRecord(id);
	}
}
