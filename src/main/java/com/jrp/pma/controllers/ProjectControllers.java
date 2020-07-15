package com.jrp.pma.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectControllers {
	
	@Autowired
	ProjectRepository projectRepo;
	
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		
		Project aProject = new Project();
		model.addAttribute("project", aProject);
		
		return "projects/new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		//this should save project to database
	projectRepo.save(project);
		return "redirect:/projects/new";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		
		return "projects/hello";
	}

}
