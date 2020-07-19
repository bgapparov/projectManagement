package com.jrp.pma.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.jrp.pma.dao.EmployeeRepository;

public class EmployeeService {
//	@Autowired
//	EmployeeRepository empRepo;
	EmployeeRepository empRepo;
	
	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	
}
