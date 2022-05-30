package com.spring.crud.demo.controller;

import com.spring.crud.demo.model.emp.Employee;
import com.spring.crud.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> list = (List<Employee>) service.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable int id) {
        Optional<Employee> employee = Optional.ofNullable(service.findById(id));
        return employee;
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Employee employee) {
        Employee savedEmployee = service.save(employee);
        return ResponseEntity.ok().body(savedEmployee);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody Employee employee) {
        Employee updatedEmployee = service.update(id, employee);
        return ResponseEntity.ok().body(updatedEmployee);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}

