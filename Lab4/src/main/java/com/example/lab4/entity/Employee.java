package com.example.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "employees")
@Setter
public class Employee {
    @Id
    @Column(name="employee_id",nullable = false,length = 40)
    private Integer employeeid;

    @Column(name="first_name",nullable = false,length = 40)
    private String firstname;

    @Column(name="last_name",nullable = false,length = 40)
    private String lastname;

    @Column(name="email",nullable = false,length = 40)
    private String email;

    @Column(name="password",nullable = false,length = 500)
    private String password;

    @Column(name="phone_number",nullable = false,length = 40)
    private String phonenumber;

    @Column(name="hire_date",nullable = false,length = 100)
    private String hiredate;

    @Column(name="job_id",nullable = false,length = 50)
    private String jobid;

    @Column(name="salary",nullable = false)
    private Double salary;

    @Column(name="manager_id")
    private Integer managerid;

    @Column(name="department_id")
    private Integer departmentid;

    @Column(name="enabled")
    private Integer enabled;

    public Employee(){

    }
}
