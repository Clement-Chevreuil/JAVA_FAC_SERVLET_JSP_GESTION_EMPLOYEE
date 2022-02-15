package com.example.application_entreprise_tp4;

public class ClassUser {

    String name, password;
    ClassEmployee emp;

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ClassUser(){}

    public ClassEmployee getEmp() {
        return emp;
    }

    public void setEmp(ClassEmployee emp) {
        this.emp = emp;
    }
}
