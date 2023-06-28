package com.tuto.demo.service.impl;

import com.tuto.demo.exception.ResourceNotFoundException;
import com.tuto.demo.model.Employee;
import com.tuto.demo.repository.EmployeeRepository;
import com.tuto.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> getAllEmployees () {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long id) {
        /*Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent())
            return employee.get();
        else
            throw new ResourceNotFoundException("Employee","Id",id);
    */
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","Id",id));
    }

}
