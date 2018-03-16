package com.ajeet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ajeet.model.Employee;
import com.ajeet.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
    EmployeeService service;
     
   
 
    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = { "/list" }, method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {
 
        List<Employee> employees = service.findAllEmployees();
        model.addAttribute("employees", employees);
        return "allemployees";
    }
}
