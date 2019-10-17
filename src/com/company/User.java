package com.company;

public class User {
    private String name;
    private int age;
    private String gender;
    private boolean student;

    public User(String name, int age, String gender, boolean student) {
        if (!this.checkAge(age)) {
            throw new IllegalArgumentException("Invalid value of age's parameter! Age could be only between 1 to 45.");
        } else {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.student = student;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isStudent() {
        return this.student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    private boolean checkAge(int age) {
        return age > 1 && age < 45;
    }

    public String toString() {
        return "User {name = " + this.name + " | age = " + this.age + " | gender = " + this.gender + " | student = " + this.student + '}';
    }
}
