package com.company.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/employees")
    public String employees() {
        return "Employee List";
    }
}