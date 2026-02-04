package com.lamda.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
	private static final Logger log = LoggerFactory.getLogger(BankController.class);
	@GetMapping("/getData")
	public ResponseEntity<String> getData(){
		log.info("API called");
		return ResponseEntity.status(HttpStatus.OK).body("Lambda Succesfully Deployed and tested");
	}

}
