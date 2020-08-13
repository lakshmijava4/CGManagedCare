package com.qdm.cg.common.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author U.LakshmiNarayana  Product POJO class to represent entity CGProduct 
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	private String Name;

	private float  Price;
	
	
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", Price=" + Price + ", brand=" + brand + "]";
	}

	private String brand;
	
	
	

	
}
