package com.company.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Employee;
import com.company.repository.EmployeeRepository;

@Service
public class Employeeservice {
	@Autowired
	EmployeeRepository repository;

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);
	}

	
}
