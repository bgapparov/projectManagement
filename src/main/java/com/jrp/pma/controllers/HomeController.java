package com.jrp.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Employee;
import com.jrp.pma.entities.Project;

@Controller
public class HomeController {

	@Autowired
	ProjectRepository projectRepo;
	@Autowired
	EmployeeRepository employeeRepo;
	
	@GetMapping("/")
	public String displayHome(Model model) {
		List<Project> projects = projectRepo.findAll();
		model.addAttribute("projectList", projects);
		
		List<Employee> employees = employeeRepo.findAll();
		model.addAttribute("employeeList", employees);
		
		
		return "main/home";
	}
	
}