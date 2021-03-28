package com.ibm.bts_practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

	public List<Bug1> getBug1() {
		return bug1Repository.findAll();
	}

	public Optional<Bug1> getBug1(String bug1Id) {
		return bug1Repository.findById(bug1Id);
	}

	public void updateBug1(@RequestBody Bug1 bug1) {
		bug1Repository.save(bug1);
	}

	public void deleteBug1(String bug1Id) {
		bug1Repository.deleteById(bug1Id);
	}

}