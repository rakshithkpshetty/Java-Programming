package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Employee;
import com.company.services.Employeeservice;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins="http://localhost:3000")

public class EmployeeController {
	
	@Autowired
	Employeeservice service;
	 @GetMapping
	 public List<Employee> getEmployees(){
		 return service.getEmployees();
		 
	 }
	 
	 
	
	 @PostMapping()
	 public  Employee saveEmployee(@RequestBody Employee employee) {
		 return service.saveEmployee(employee);
		 
	 }
	 
	 
	 

}
