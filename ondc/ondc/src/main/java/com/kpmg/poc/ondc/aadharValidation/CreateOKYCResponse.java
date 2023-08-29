package com.kpmg.poc.ondc.aadharValidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateOKYCResponse {

	private String  id;
	private String  traceId;
	private String  status;
	
}
