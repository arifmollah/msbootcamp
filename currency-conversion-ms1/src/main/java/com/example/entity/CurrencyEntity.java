package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyEntity {
	
	@Id
	private String id;
	private Double conversinFcator;
	
	
	


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Double getConversinFcator() {
		return conversinFcator;
	}



	public void setConversinFcator(Double conversinFcator) {
		this.conversinFcator = conversinFcator;
	}



	@Override
	public String toString() {
		return "CurrencyConversion [countryCode=" + id + ", conversinFcator=" + conversinFcator + "]";
	}
	

}
