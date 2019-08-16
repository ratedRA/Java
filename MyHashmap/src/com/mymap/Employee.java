package com.mymap;

public class Employee {
    private int empId;
    private String empName;
    private String empMail;

    public Employee(int empId, String empName, String empMail) {
        this.empId = empId;
        this.empName = empName;
        this.empMail = empMail;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpMail() {
        return empMail;
    }
}
