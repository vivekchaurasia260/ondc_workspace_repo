package com.kpmg.poc.ondc.panvalidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PanValidationResponse {

	private PanData data;
	private String message;
	private String verification;
	private String traceId;
}
