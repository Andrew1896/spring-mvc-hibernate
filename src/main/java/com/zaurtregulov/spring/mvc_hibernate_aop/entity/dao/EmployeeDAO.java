package com.zaurtregulov.spring.mvc_hibernate_aop.entity.dao;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    //    @Override
    //    public void saveEmployee(Employee employee) {
    //        Session session = sessionFactory.getCurrentSession();
    //        session.saveOrUpdate(employee);
    //    }
    //
//
//    void deleteEmployee(int id);
}
