package com.capgemini.employee;

import java.text.ParseException;

public class EmployeeMain {
    public static void main(String[] args) throws ParseException {
        Employee emp = new Employee();
        emp.readEmployeeDetails();
        emp.displayEmployeeDetails();
    }
}
