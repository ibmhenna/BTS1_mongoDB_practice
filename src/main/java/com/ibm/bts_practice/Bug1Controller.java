package com.ibm.bts_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.bts_practice.service.Bug1Service;
import com.ibm.bts_practice.service.entity.Bug1;

@RestController
public class Bug1Controller {
	@Autowired
	Bug1Service bug1Service;

	/**
	 * method to create bug
	 * @param bug1
	 * @param bindingResult
	 * @return id
	 */
	@PostMapping("/bug1")
	String CreateBug1(@RequestBody Bug1 bug1) {
		return bug1Service.createBug1(bug1);
	}

}