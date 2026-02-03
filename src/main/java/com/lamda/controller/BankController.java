package com.lamda.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@GetMapping("/getData")
	public ResponseEntity<String> getData(){
		return ResponseEntity.status(HttpStatus.OK).body("Lambda Succesfully Deployed");
	}

}
