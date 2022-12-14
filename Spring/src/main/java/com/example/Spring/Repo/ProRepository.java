package com.example.Spring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.entity.Product;

public interface ProRepository extends JpaRepository<Product,Integer>{

}
