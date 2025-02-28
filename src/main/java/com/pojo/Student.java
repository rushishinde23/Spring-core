package com.pojo;

public class Student {
    private int studentId;
    private String StudentName;
    private String StudentCity;

    public Student(int studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        StudentName = studentName;
        StudentCity = studentCity;
    }

    public Student(){
       // super();
        System.out.println("Student object created...");

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("Set studentId gets called");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("Set studentName gets called");

        StudentName = studentName;
    }

    public String getStudentCity() {
        return StudentCity;
    }

    public void setStudentCity(String studentCity) {
        System.out.println("Set studentCity gets called");

        StudentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentCity='" + StudentCity + '\'' +
                '}';
    }
}
