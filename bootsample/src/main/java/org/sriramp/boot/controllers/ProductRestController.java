package org.sriramp.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sriramp.boot.service.TaskService;

@RestController
public class ProductRestController {
	

@Autowired	
private TaskService taskService;

@GetMapping("/hello")	
public String hello()
{
	return "Hello World!!!";
	
}
	
@GetMapping("/all-tasks")
public String allTasks()
{
	return taskService.findAll().toString();
}
	
}
