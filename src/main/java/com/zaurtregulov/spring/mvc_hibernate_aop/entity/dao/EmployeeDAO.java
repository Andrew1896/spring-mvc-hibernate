package com.zaurtregulov.spring.mvc_hibernate_aop.entity.dao;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    //    @Override
    //    public void saveEmployee(Employee employee) {
    //        Session session = sessionFactory.getCurrentSession();
    //        session.saveOrUpdate(employee);
    //    }
    //
    Employee getEmployee(int id);
//
//    public void saveEmployee(Employee employee);
//
//    Employee getEmployee(int id);
//
//    void deleteEmployee(int id);
}
