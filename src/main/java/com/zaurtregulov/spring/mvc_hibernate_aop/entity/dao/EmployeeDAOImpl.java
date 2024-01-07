package com.zaurtregulov.spring.mvc_hibernate_aop.entity.dao;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
        return null;
    }
}
