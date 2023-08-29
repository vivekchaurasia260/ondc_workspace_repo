package com.kpmg.poc.ondc.aadharValidation;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AadharValidationService {
	
	@Autowired
	public RestTemplate restTemplate;
	List<CreateOKYCResponse>  createOKYCResponseList = new LinkedList<CreateOKYCResponse>();
	public CreateOKYCResponse createAadharOKYC()
	{
		String url="https://dg-sandbox.setu.co/api/okyc";
		String validUpto = "2023-07-17T10:16:19+05:30";
		String traceId= "1-64abda73-6787795b0fe2713f32aaba03";
		
		String clientId= "a85913df-8721-44ff-98f2-91fc632ed556";
		String clientSecret="f8188e49-9cb6-44db-bf72-2796161c7710";
		
		
		 HttpHeaders responseHeaders = new HttpHeaders();
		 	responseHeaders.set("x-client-id",clientId);
		  	responseHeaders.set("x-client-secret",clientSecret );
		  	responseHeaders.set("validUpto",validUpto);
		  	responseHeaders.set("traceId",traceId );
		  	responseHeaders.set("url",url );
		  	
		  	CreateOKYCResponse response = new CreateOKYCResponse();
		  	response.setTraceId("1-64acecde-08d8d69d336d62554d65d8c1");
		  	response.setStatus("f9fffe50-22f6-44aa-b66b-7139efe4099a");
		  	response.setId("f9fffe50-22f6-44aa-b66b-7139efe4099a");
		  	createOKYCResponseList.add(response);
		  	
		  //ResponseEntity<CreateOKYCResponse> response = restTemplate.postForEntity(url,null, CreateOKYCResponse.class);
		  	ResponseEntity<CreateOKYCResponse> responseBody= new ResponseEntity<CreateOKYCResponse>(response,HttpStatus.CREATED);
		
		  	return responseBody.getBody();	
		
	}
	
	public InitiateOKYCResponse initiateAadharOKYC(String requestId)
	{
		for(CreateOKYCResponse createResponse :createOKYCResponseList) {
			if(createResponse.getId().equals(requestId)) {
				
				InitiateOKYCResponse initiateOKYCResponse = new InitiateOKYCResponse();
				initiateOKYCResponse.setId(requestId);
				initiateOKYCResponse.setTraceId(createResponse.getTraceId());
				initiateOKYCResponse.setCaptchaImage("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");
				initiateOKYCResponse.setCaptchaRetriesRemaining("4");
				ResponseEntity<InitiateOKYCResponse> responseBody= new ResponseEntity<InitiateOKYCResponse>(initiateOKYCResponse,HttpStatus.ACCEPTED);
				return responseBody.getBody();	
			}
		}
		return null;
		
	}
	
	public VerifyOKYCResponse verifyAadharOKYC(String requestId)
	{
		for(CreateOKYCResponse createResponse :createOKYCResponseList) {
			if(createResponse.getId().equals(requestId)) {
				
				VerifyOKYCResponse verifyOKYCResponse = new VerifyOKYCResponse();
				verifyOKYCResponse.setId(requestId);
				verifyOKYCResponse.setTraceId(createResponse.getTraceId());
				verifyOKYCResponse.setCode("otp_sent");
				verifyOKYCResponse. setMessage("OTP sent to your registered mobile number.");
				ResponseEntity<VerifyOKYCResponse> responseBody= new ResponseEntity<VerifyOKYCResponse>(verifyOKYCResponse,HttpStatus.ACCEPTED);
				return responseBody.getBody();	
			}
		}
		return null;
		
	}
	
	public AadharData completeAadharOKYC(String requestId)
	{
		for(CreateOKYCResponse createResponse :createOKYCResponseList) {
			if(createResponse.getId().equals(requestId)) {
				
				AadharData aadharDataResponse = new AadharData();
				
				Address address = new Address();
				address.setCareOf("S/O: Harish M J ");
				address.setCountry("Bangalore");
				address.setDistrict("Bangalore");
				address.setHouse("#1234");
				address.setLandmark("");
				address.setLocality("MG Road");
				address.setPin("560001");
				address.setPostOffice("MG Road");
				address.setState("Karnataka");
				address.setStreet("1st Cross, 2nd main");
				address.setSubDistrict("Bangalore South");
				address.setVtc("Bidarahalli");
				
				aadharDataResponse.setAddress(address);
				
				aadharDataResponse.setDateOfBirth("09-03-1994");
				aadharDataResponse.setEmail("gpradeep906@gmail.com");
				aadharDataResponse.setGender("M");
				aadharDataResponse.setGeneratedAt("202105311528");
				aadharDataResponse.setMaskedNumber("xxxx-xxxx-3170");
				aadharDataResponse.setName("Mahesh S");
				aadharDataResponse.setPhone("8630920178");
				aadharDataResponse.setPhoto("");
				
				Verified verify = new Verified();
				verify.setEmail(false);
				verify.setPhone(false);
				verify.setSignature(true);
				
				aadharDataResponse.setVerified(verify);
				
				Xml xml= new Xml();
				xml.setFileUrl("");
				xml.setShareCode("1234");
				xml.setValidUntil("Wed, 19 Jul 2023 09:03:16 GMT");
				
				aadharDataResponse.setXml(xml);
				
				aadharDataResponse.setId(requestId);
				aadharDataResponse.setTraceId(createResponse.getTraceId());
				aadharDataResponse.setStatus("complete");

				ResponseEntity<AadharData> responseBody= new ResponseEntity<AadharData>(aadharDataResponse,HttpStatus.ACCEPTED);
				return responseBody.getBody();	
			}
		}
		return null;
		
	}
	

}
