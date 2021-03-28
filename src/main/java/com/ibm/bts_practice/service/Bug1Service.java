package com.ibm.bts_practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bts_practice.service.entity.Bug1;
import com.ibm.bts_practice.service.repo.Bug1Repository;

@Service
public class Bug1Service {

	@Autowired
	Bug1Repository bug1Repository;

	public String createBug1(Bug1 bug1) {
		Bug1 savedBug1 = bug1Repository.save(bug1);
		return savedBug1.getId();
	}

}