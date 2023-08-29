package com.kpmg.poc.ondc.panvalidation;



import java.net.URI;
import java.net.http.HttpClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PanValidationService {
	
	@Autowired
	public RestTemplate restTemplate;
	
	public PanValidationResponse panVerification(PanValidationRequest req)
	{
		String url="https://dg-sandbox.setu.co/api/verify/pan";
		String clientId= "a85913df-8721-44ff-98f2-91fc632ed556";
		String clientSecret="f8188e49-9cb6-44db-bf72-2796161c7710";
		
		/*HttpClient httpClient = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.
		  .header("X-Our-Header-1", "value1")
		  .header("X-Our-Header-1", "value2")
		  .header("X-Our-Header-2", "value2")
		  .uri(new URI(url)).build();*/
		
		 HttpHeaders responseHeaders = new HttpHeaders();
		 	responseHeaders.set("clientId",clientId);
		
		  	responseHeaders.set("clientSecret",clientSecret );
			    
		  	HttpEntity<PanValidationRequest> entity = new HttpEntity<>(req, responseHeaders);
			  
		  	ResponseEntity<PanValidationResponse> response = restTemplate.postForEntity(url, entity, PanValidationResponse.class);
		  	//PanValidationResponse response =  restTemplate.postForEntity(url, entity, String.class);
		  	
		  	if (response.getStatusCode() == HttpStatus.OK) {
	            System.out.println("Request Successful");
		  	}
		  	else {
		  		System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
		  	}
		  	
		  	
//		  	RestTemplate restTemplate = new RestTemplate();
//		PanValidationResponse result = restTemplate.getForObject(url, PanValidationResponse.class);
		
		return response.getBody();		
	}
	

}
