package com.example.test_project;

import org.springframework.web.bind.annotation.*;

@RestController //annotation - Rest API to expose and access it via the internet
public class HomeController
{
    //accessing and exposing
    static String mappingType;

    @GetMapping("/")
    public String getMapping()
    {
        mappingType = "GET Method";

        return "This is a " + mappingType;
    }

    @PostMapping("/")
    public String postMapping()
    {
        mappingType = "POST Method";

        return "This is a " + mappingType;
    }

    @PutMapping("/")
    public String putMapping()
    {
        mappingType = "PUT Method";

        return "This is a " + mappingType;
    }

    @DeleteMapping("/")
    public String deleteMapping()
    {
        mappingType = "DELETE Method";

        return "This is a " + mappingType;
    }

    //sending multiple parameters as requests using @RequestParam
    @PostMapping("/add")
    public String addMethod(@RequestParam Integer num1, @RequestParam Integer num2)
    {
        Integer addition = num1 + num2;

        return "This addition is:  " + addition;
    }


    @PostMapping("/multiply")
    public String multiplyMethod(@RequestParam Integer num1, @RequestParam Integer num2)
    {
        Integer multiply = num1 * num2;

        return "This addition is:  " + multiply;
    }

    //sending multiple Class Object parameters as requests using @RequestParam
    @PostMapping("/student")
    public StudentResponse addStudent(@RequestBody StudentRequest studentRequest)
    {
        System.out.println("This is Student Request Body Name: " + studentRequest.name);

        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setResult("FAIL");
        studentResponse.setSubject("SESOTHO");

        return studentResponse;
    }
}
