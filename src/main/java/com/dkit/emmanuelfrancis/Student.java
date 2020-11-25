package com.dkit.emmanuelfrancis;

public class Student {
    private String name;
    private String ID;
    private String email;
    private String telephone;
    private String computersOnLoan;

    public Student(String name, String ID, String email, String telephone, String computersOnLoan) {
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.telephone = telephone;
        this.computersOnLoan = computersOnLoan;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getComputersOnLoan() {
        return computersOnLoan;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setComputersOnLoan(String computersOnLoan) {
        this.computersOnLoan = computersOnLoan;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", computersOnLoan='" + computersOnLoan + '\'' +
                '}';
    }
}
