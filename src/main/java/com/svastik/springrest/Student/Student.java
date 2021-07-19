package com.svastik.springrest.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_seq",
            sequenceName = "student_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_seq"
            
    )
    private int id;
    private String Name;
    private String rollNo;
    private String Phone;

    //parametarised constructor
    public Student(int id, String name, String rollNo, String phone) {
        this.id = id;
        this.Name = name;
        this.rollNo = rollNo;
        this.Phone = phone;
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {

        this.Phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + 
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", rollNo=" + rollNo +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}


