package com.kpmg.poc.ondc.aadharValidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AadharData {
	private String  id;
	private String  traceId;
	private String  status;	
	private Address address;
	private Verified verified;
	private Xml xml;
	private String dateOfBirth;
	private String email;
	private String gender;
	private String generatedAt;
	private String maskedNumber;
	private String name;
	private String phone;
	private String photo;

}
