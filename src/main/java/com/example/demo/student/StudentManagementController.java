package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "John bonny"),
            new Student(2, "gokin mockin"),
            new Student(3, "Thid student")
    );

    @GetMapping
    public List<Student> getAllStudent(){
        return STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(Student student){
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Integer studentId, Student student){
        System.out.println(String.format("%s %s", studentId, student));
    }
}
