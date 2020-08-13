package com.qdm.cg.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column
	private String UserName;
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", UserName=" + UserName + "]";
	}
	
	
	
}
