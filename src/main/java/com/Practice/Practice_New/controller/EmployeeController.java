package com.Practice.Practice_New.controller;


import com.Practice.Practice_New.Model.Employee;
import com.Practice.Practice_New.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //handler method

    @GetMapping("eid/{eid}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("eid") long eid){

       Employee employee= employeeService.getEmployeeBy_id(eid);
        ResponseEntity<Employee> employeeResponseEntity = new ResponseEntity<>(employee, HttpStatus.FOUND);
        return employeeResponseEntity;
    }

}
