package com.afs.restapi.service.dto;

import com.afs.restapi.entity.Employee;

import java.util.List;

public class CompanyRequest {

    private String name;
    private List<Employee> employees;

    public CompanyRequest() {
    }

    public CompanyRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
