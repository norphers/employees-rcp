package com.itAcademy.springSimpleHTTPServiceRCP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itAcademy.springSimpleHTTPServiceRCP.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
}