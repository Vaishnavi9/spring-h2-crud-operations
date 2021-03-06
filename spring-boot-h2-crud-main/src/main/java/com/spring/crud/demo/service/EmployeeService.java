package com.spring.crud.demo.service;

import org.springframework.stereotype.Service;
import com.spring.crud.demo.model.emp.Employee;

import java.util.List;

@Service
public interface EmployeeService {

    List<?> findAll();

    Employee findById(int id);

    Employee save(Employee superHero);

	Employee update(int id, Employee employee);

    void delete(int id);

}