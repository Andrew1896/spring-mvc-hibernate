package com.zaurtregulov.spring.mvc_hibernate_aop.service;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;

public interface EmployeeService {
//    public List<Employee> getAllEmployees();
//
//    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }
}
