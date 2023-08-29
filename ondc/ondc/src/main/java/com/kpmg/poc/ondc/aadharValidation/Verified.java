package com.kpmg.poc.ondc.aadharValidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Verified {
	
	public Verified() {
		// TODO Auto-generated constructor stub
	}
	boolean email;
	boolean phone;
	boolean signature;
}
