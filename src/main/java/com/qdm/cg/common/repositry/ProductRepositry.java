package com.qdm.cg.common.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdm.cg.common.model.Product;


@Repository
public interface ProductRepositry extends JpaRepository<Product, Integer> {

	public List<Product> getProduct();

	public String emotionalStatus(String status);

	public List<String> getAllSkils(String skils);

	public List<Product> existsById(String id);

}
