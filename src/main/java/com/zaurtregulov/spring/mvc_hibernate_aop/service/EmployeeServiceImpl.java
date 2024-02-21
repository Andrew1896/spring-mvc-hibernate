package com.zaurtregulov.spring.mvc_hibernate_aop.service;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public Employee getEmployee(int id) {
        return null;
    }

//    @Autowired
//    private EmployeeDAO employeeDAO;
//
//    @Override
//    @Transactional
//    public List<Employee> getAllEmployees() {
//        return employeeDAO.getAllEmployees();
//    }
//
//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDAO.saveEmployee(employee);
//
//    }
}
