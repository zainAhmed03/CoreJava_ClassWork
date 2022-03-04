package com.capgemini.student;

import java.text.ParseException;
import java.util.Scanner;

public class StudentCRUD {
    //Array of student objects
    Student [] listOfStudents = new Student[30];
    Student student;
    int noOfStudents;
    Scanner sc = new Scanner(System.in);
    char ch = 'y';

    public void menu() throws ParseException {

        while (ch == 'y') {

            System.out.println("Enter the choice");
            System.out.println("add   : to add student in the array ");
            System.out.println("update: to update student in the array ");
            System.out.println("delete: to delete student in the array ");
            System.out.println("search: to search student in the array ");
            sc.nextLine();
            String choice = sc.next();
            switch (choice) {
                case "add":
                    addStudent();
                    break;
                case "update":
                    updateStudent();
                    break;
                case "delete":
                    deleteStudent();
                    break;
                case "display":
                    displayStudent();
                    break;
                case "search":
                    searchStudent();
                    break;
                default:
                    System.out.println("Not a proper choice");
                    break;
            }
            System.out.print("do you want to continue ? (y/n): ");
            ch = sc.next().charAt(0);
        }// while close
    }
    int count = 0;
    int j = 0;
    void searchStudent(){
        System.out.println("Enter the student details to search ");
        System.out.println("Enter the student id to search ");
        int sId = sc.nextInt();
        for (int i = 0 ; i < noOfStudents ; i++) {
            if (listOfStudents[i].studentId == sId) {
                count++;
                j = i;
            }
        }
        if (count > 1) {
            System.out.println("Student Found");
            listOfStudents[j].displayStudentDetails();
        } else {
            System.out.println("Student Not Found");
        }
    }

    void displayStudent(){
        System.out.println("Enter the student details to display");
        //display the student data

        for (int i = 0 ; i < noOfStudents ; i++) {
            if (listOfStudents[i] == null) {
                continue;
            }
            listOfStudents[i].displayStudentDetails();
        }
    }

    void deleteStudent(){
        System.out.println("Enter the student details to delete");
        System.out.println("Enter the student id to search ");
        int sId = sc.nextInt();
        for (int i = 0 ; i < noOfStudents ; i++) {
            if (listOfStudents[i].studentId == sId) {
                listOfStudents[i] = null;
                break;
            } else {
                System.out.println("Student Not Found");
            }
        }
    }

    void updateStudent(){
        System.out.println("Enter the student details to update");
        int sId = sc.nextInt();
        for (int i = 0 ; i < noOfStudents ; i++) {
            if (listOfStudents[i].studentId == sId) {
                System.out.println("Enter the new details of student to update");
                System.out.println("Enter the new email of student");
                sc.nextLine();
                listOfStudents[i].studentEmail = sc.nextLine();
                break;
            } else {
                System.out.println("Student Not Found");
            }
        }
    }

    void addStudent() throws ParseException {
        System.out.println("Enter the student details");
        //creating and adding student objects in the above array
        System.out.println("Enter the number of students");
        noOfStudents = sc.nextInt();
        for (int i = 0 ;i < noOfStudents ; i++) {
            student  = new Student();
            student.readStudentDetails();
            listOfStudents[i] = student;
        }
    }
}
