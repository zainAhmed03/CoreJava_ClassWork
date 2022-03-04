package com.capgemini.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*practice program on class and object
===============================
create a class Employee(employeeId,employeeName,employeeEmail,employeeMobNo,employeeDOB,employeeDOJ)
readEmployeeDetails
displayEmployeeDetails*/
public class Employee {
    //instance variables
    int employeeId;
    String employeeName;
    String employeeEmail;
    String employeeMobNo;
    Date employeeDOB;
    Date employeeDOJ;

    Scanner sc = new Scanner(System.in);
    //instance methods
    void readEmployeeDetails() throws ParseException {
        System.out.println("Enter the Employee Data");
        System.out.println("Enter the Employee id: ");
        employeeId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Employee Name: ");
        employeeName = sc.nextLine();
        System.out.println("Enter the Employee Email: ");
        employeeEmail = sc.nextLine();
        System.out.println("Enter the Employee PHno: ");
        employeeMobNo = sc.nextLine();
        System.out.println("Enter the Date of Birth: dd/MM/yyyy");
        String dob = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        employeeDOB = sdf.parse(dob);
        System.out.println("Enter the Date of Joining: dd/MM/yyyy");
        String doj = sc.nextLine();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        employeeDOJ = sdf1.parse(doj);
    }

    void displayEmployeeDetails(){
        System.out.println("Enterd Employee data...");
        System.out.println("Employee   id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Email:"+employeeEmail);
        System.out.println("Employee Mobno:"+employeeMobNo);
        System.out.println("Employee   Dob:"+employeeDOB);
        System.out.println("Employee   Doj:"+employeeDOJ);
    }

}

