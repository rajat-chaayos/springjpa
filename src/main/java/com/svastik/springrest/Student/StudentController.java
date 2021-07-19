package com.svastik.springrest.Student;

import com.svastik.springrest.Student.StudentService;
import com.svastik.springrest.Student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @Autowired
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }


    @GetMapping
    public Student getStudents() {
        return  this.service.getStudents();
    }

}
