package com.example.desafio_3.services;

import com.example.desafio_3.domain.Employee;
import com.example.desafio_3.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> get() {
        List<Employee> obj = employeeRepository.findAll();

        return obj;

    }

    public Employee insert(Employee obj) {
        obj.setId(null);
        return employeeRepository.save(obj);
    }
}
