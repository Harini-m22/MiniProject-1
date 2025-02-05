package com.example.employee.service;


import java.util.List;

import com.example.employee.entity.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
