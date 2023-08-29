package com.kpmg.poc.ondc.panvalidation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PanData {
	
 String aadhaar_seeding_status;
 String category;
 String full_name;
 
	

}
