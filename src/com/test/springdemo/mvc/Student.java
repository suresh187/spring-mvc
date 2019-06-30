package com.test.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;

@Component
public class Student {
	String firstName;
	String lastName;
	private LinkedHashMap<String , String> countryOptions;
	String country;
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
		countryOptions.put("BR", "aaa");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
