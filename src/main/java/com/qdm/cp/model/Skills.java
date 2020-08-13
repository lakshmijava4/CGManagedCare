package com.qdm.cp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author U Lakshmi Narayana   Skills 
 * Lombok: adds getters and setters
 *
 */
@Entity
@Data
@Table(name = "Skills")
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String label;
	@Column
	private String description;
	
	public Skills(String label, String description) {
		super();
		this.label = label;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", label=" + label + ", description=" + description + "]";
	}

}
