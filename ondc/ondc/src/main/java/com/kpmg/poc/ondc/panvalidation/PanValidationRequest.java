package com.kpmg.poc.ondc.panvalidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PanValidationRequest {
	
	private String pan;
	private String consent;
	private String reason;
	
	

}
