package com.afs.restapi.service.dto;

public class EmployeeUpdateRequest {
    private Integer age;
    private Integer salary;

    public EmployeeUpdateRequest(Integer age, Integer salary) {
        this.age = age;
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
