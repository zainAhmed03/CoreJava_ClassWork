package com.capgemini.student;

import java.text.ParseException;

public class StudentMain {
    public static void main(String[] args) throws ParseException {
       StudentCRUD scrud = new StudentCRUD();
       scrud.menu();
    }
}
