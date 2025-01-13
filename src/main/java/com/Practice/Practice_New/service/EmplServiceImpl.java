package com.Practice.Practice_New.service;

import com.Practice.Practice_New.Model.Employee;
import com.Practice.Practice_New.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EmplServiceImpl  implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee getEmployeeBy_id(long eid) {
        Employee employee = employeeRepo.findById(eid).get();
        return employee;
    }
}
