package org.spring.practise.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Student {

    private String studentName;

    public Student(){
        System.out.println("Default Student Constructor");
    }

    @Autowired
    public Student( String studentName){
        this.studentName=studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void joinClass(){
        System.out.println(studentName+" has joined the class");
    }
}
