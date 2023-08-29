package com.kpmg.poc.ondc.aadharValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/okyc")
public class AadharValidationController {
	
    
	@Autowired
	AadharValidationService aadharValidationService;
	
    @PostMapping
    public CreateOKYCResponse createAadharOKYC() {
    	
    	CreateOKYCResponse response= aadharValidationService.createAadharOKYC();

		return response;
    }
    
    @GetMapping("/{requestId}/initiate")
    public InitiateOKYCResponse initiateAadharOKYC(@PathVariable String requestId) {
    	
    	InitiateOKYCResponse response= aadharValidationService.initiateAadharOKYC(requestId);

		return response;
    } 
    
    @PostMapping("/{requestId}/verify")
    public VerifyOKYCResponse verifyAadharOKYC(@PathVariable String requestId) {
    	
    	VerifyOKYCResponse response= aadharValidationService.verifyAadharOKYC(requestId);

		return response;
    }
    @PostMapping("/{requestId}/complete")
    public AadharData completeAadharOKYC(@PathVariable String requestId) {
    	
    	AadharData response= aadharValidationService.completeAadharOKYC(requestId);

		return response;
    }
    
    @GetMapping("/home")
    public String home()
    {
    	return "This is home";
    }
}
