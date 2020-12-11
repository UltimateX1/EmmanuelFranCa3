package com.dkit.emmanuelfrancis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB {
    private ArrayList<Student> students;
    private static Scanner keyboard = new Scanner(System.in);

    public StudentDB() {
        this.students = new ArrayList<>();
    }

    protected void loadStudentFromFile() {
        try (Scanner computerFile = new Scanner(new BufferedReader
                (new FileReader("students.txt")))) {
            String input;
            while (computerFile.hasNextLine()) {
                input = computerFile.nextLine();
                String[] data = input.split(",");
                String name = data[0];
                String ID = data[1];
                String email = data[2];
                String telephone = data[3];
                String computersOnLoan = data[4];



                Student readInStudent = new Student(name, ID, email, telephone, computersOnLoan);
                this.students.add(readInStudent);
            }
        } catch (FileNotFoundException fne) {
            System.out.println(Colours.BLUE + "Could not load student. If this is " +
                    "the first time running the program this could be fine" + Colours.RESET);
        }
    }
}
