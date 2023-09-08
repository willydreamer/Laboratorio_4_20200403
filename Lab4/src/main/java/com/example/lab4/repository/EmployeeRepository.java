package com.example.lab4.repository;

import com.example.lab4.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select * from employees where first_name = ?1 or last_name = ?1 ",
            nativeQuery = true)
    List<Employee> buscarEmployeePorNombreyApellido(String nombre);
}
