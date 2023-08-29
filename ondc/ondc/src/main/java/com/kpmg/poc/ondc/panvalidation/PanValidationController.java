package com.kpmg.poc.ondc.panvalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/verify/pan")
public class PanValidationController {
	@Autowired
	PanValidationService panValidationService;

    @PostMapping
    public PanValidationResponse panVerification(@RequestBody PanValidationRequest request ) {
    	
    	
    	PanValidationResponse response= panValidationService.panVerification(request);
    	
    	
		return response;
    	
        
    }

}
