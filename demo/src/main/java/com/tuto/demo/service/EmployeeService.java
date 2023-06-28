package com.tuto.demo.service;

import com.tuto.demo.model.Employee;

import java.util.List;

public interface EmployeeService{
    Employee saveEmployee ( Employee employee );
    List<Employee> getAllEmployees ();
}
