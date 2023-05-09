package com.example.desafio_3.repositories;

import com.example.desafio_3.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, List> {

}
