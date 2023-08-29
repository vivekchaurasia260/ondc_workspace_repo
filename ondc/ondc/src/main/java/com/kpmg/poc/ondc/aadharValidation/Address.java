package com.kpmg.poc.ondc.aadharValidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Address {
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	String careOf;
	String country;
	String district;
	String house;
	String landmark;
	String locality;
	String pin;
	String postOffice;
	String state;
	String street;
	String subDistrict;
	String vtc;

}
