package com.kpmg.poc.ondc.aadharValidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Xml {

	public Xml() {
		// TODO Auto-generated constructor stub
	}
	String fileUrl;
	String validUntil;
	String shareCode;

}
