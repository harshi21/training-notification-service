package com.verizontraining.notificationservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
     private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping("/send-email")
	public SendEmalRequest sendEmail(@RequestBody SendEmalRequest request) {
		
		System.out.println(request.getEmailType()+" sent to person "+ request.getPersonName()+" to his email id"+request.getEmailId());
		System.out.println("------------------------------------");
		logger.info("{}", request);
		
		return request;
	}
}
