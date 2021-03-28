package com.ibm.bts_practice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	 * 
	 * @param bug1
	 * @param bindingResult
	 * @return id
	 */
	@PostMapping("/bug1")
	String CreateBug1(@RequestBody Bug1 bug1, BindingResult bindingResult) {
		validateModel(bindingResult);
		return bug1Service.createBug1(bug1);
	}

	/**
	 * validation
	 * 
	 * @param bindingResult
	 */
	private void validateModel(Errors bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Something went wrong. Plesae retry");
		}
	}

	/**
	 * method to get the items as a list
	 * 
	 * @return
	 */
	@GetMapping("/bug1")
	List<Bug1> getBug1() {
		return bug1Service.getBug1();
	}

	/**
	 * method to get bug details
	 * 
	 * @param bugId
	 * @return zero or matching id
	 */
	@GetMapping("/bug1/{id}")
	Optional<Bug1> getBug1(@PathVariable("id") String bug1Id) {
		return bug1Service.getBug1(bug1Id);
	}

	/**
	 * updates changes in bug
	 * 
	 * @param bug1Id
	 * @param bug1
	 */
	@PutMapping("/bug1/{id}")
	void updateBug1(@PathVariable("id") String bug1Id, @RequestBody Bug1 bug1, BindingResult bindingResult) {
		validateModel(bindingResult);
		bug1.setId(bug1Id);
		bug1Service.updateBug1(bug1);
	}

}