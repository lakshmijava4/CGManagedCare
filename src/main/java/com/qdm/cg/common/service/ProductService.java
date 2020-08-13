package com.qdm.cg.common.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdm.cg.common.model.Product;
import com.qdm.cg.common.repositry.ProductRepositry;

@Service
public class ProductService {
	@Autowired
	private ProductRepositry repositry;

	
	public List<Product>getSendCGRecommendation(List<Product> product){
		return repositry.getProduct();
		
	}
	
	public List<Product>getCGActivity(){
		return repositry.getProduct();

	}

	public Optional<Product> findById(Integer productId) {
		// TODO Auto-generated method stub
		return repositry.findById(productId);
	}
	
	public List<Product> financialNotification(String id){
		return repositry.existsById(id);
		
	}
}
