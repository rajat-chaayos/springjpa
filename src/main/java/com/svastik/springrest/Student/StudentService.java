package com.svastik.springrest.Student;

import org.springframework.stereotype.Service;


@Service
public class StudentService {
    

    public Student getStudents(){
                return  new Student(1, "Rajat", "1803210117", "8510866788");
//            return List.addAll(
//                    new Student(1, "Rajat", "1803210117", "8510866788"),
//                    new Student(2, "Rohit", "1803210118", "8510866788"),
//                    new Student(3, "Shubham", "1803210119", "8510866788"),
//                    new Student(4, "Siddharth", "1803210120", "8510866788"));
        }
}
