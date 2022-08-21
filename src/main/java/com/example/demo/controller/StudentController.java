package com.example.demo.controller;

import com.example.demo.repositery.Repositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    Repositery repositery;

}
