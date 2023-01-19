package com.example.restapi.controller;

import com.example.restapi.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //build rest api to handle query parameters
    //localhost:8080/student/query?firstName=Ellie&lastName=syd
    @GetMapping("/student/query")
    public Student getStudents(@RequestParam(value = "name", defaultValue = "Ellie")String name
            , @RequestParam(value = "lastName", defaultValue = "syd") String lastName){
               return new Student(name,lastName);
    }

    //localhost:8080/student1/query?firstName=Ellie&lastName=syd
    @GetMapping("/student1/query")
    public Student getStudent1(@RequestParam(name = "firstName") String firstName
            , @RequestParam(name = "lastName") String lastName){
        return new Student(firstName,lastName);
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sina", "Ebrahimi"));
        students.add(new Student("nina", "Seyed"));
        students.add(new Student("Mans", "Has"));
        students.add(new Student("Mehdi", "ardabil"));
        return students;
    }

    //localhost:8080/student/ela/syd
    //@PathVariable
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName
            ,@PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }


}