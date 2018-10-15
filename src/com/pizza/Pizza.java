package com.pizza;

public class Pizza {
	
	public String code;
	public String designation;
	public double prix;
	
	/**
	 * Constructor
	 * @param code
	 * @param designation
	 * @param prix
	 */
	public Pizza(String code, String designation, double prix) {
		this.code = code;
		this.designation = designation;
		this.prix = prix;
	}
	
	
	/**
	 * Display result toString
	 * @return
	 */
	public String toString() {
		String result = "Code : " + code + "\r\n";
		result += "D�signation : " + designation + "\r\n";
		result += "Prix : " + prix;
		
		return result;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	
}
