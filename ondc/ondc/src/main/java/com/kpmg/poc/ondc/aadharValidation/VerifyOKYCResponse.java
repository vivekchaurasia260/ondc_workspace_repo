package com.kpmg.poc.ondc.aadharValidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VerifyOKYCResponse {

	private String  id;
	private String  traceId;
	private String  message;
	private String  code;
	
}
