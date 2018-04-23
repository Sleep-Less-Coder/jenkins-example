package com.hemant.swaggerspringboot.example.model;

import io.swagger.annotations.ApiModelProperty;

public class User {

    @ApiModelProperty(value = "Username of the user.", required = true)
    private String username;

    @ApiModelProperty(value = "Salary of the user.", required = true)
    private long salary;

    public User(String username, long salary) {
        this.username = username;
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
