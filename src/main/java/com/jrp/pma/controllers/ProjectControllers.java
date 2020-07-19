package com.jrp.pma.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Employee;
import com.jrp.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectControllers {
	
	@Autowired
	ProjectRepository projectRepo;
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@GetMapping
	public String displayEmployees(Model model) {
		List<Project> projects = projectRepo.findAll();
		model.addAttribute("projects", projects);
		return "projects/list-projects";
	}
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		
		Project aProject = new Project();
		List<Employee> employees = employeeRepo.findAll();
		model.addAttribute("project", aProject);
		model.addAttribute("allEmployees", employees);
		
		return "projects/new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project, BindingResult bindingResult, /* @RequestParam List<Long> employees,*/  Model model) {
		//this should save project to database
	projectRepo.save(project);
	
//	Iterable<Employee> chosenEmployees = employeeRepo.findAllById(employees);
//	for(Employee emp : chosenEmployees) {
//		emp.setProject(project);
//		employeeRepo.save(emp);
//	}
	
		return "redirect:/projects/new";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		
		return "projects/hello";
	}

}
