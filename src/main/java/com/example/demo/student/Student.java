package com.example.demo.student;

public class Student {

    private final Integer studentId;
    private final String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "studId " + studentId + " " + "studname " + studentName;
    }
}
