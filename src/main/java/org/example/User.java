package org.example;

public class User {

    private int id;
    private String last_name;
    private String first_name;
    private String surname;
    private String post;
    private String department;
    private int salary;

    public User(int id, String last_name, String first_name, String surname, String post, String department, int salary) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.surname = surname;
        this.post = post;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", surname='" + surname + '\'' +
                ", post='" + post + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}