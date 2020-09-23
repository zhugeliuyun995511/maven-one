package com.example.springboottest000.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    @RequestMapping("hello")
    String hello()
    {
        return "hello world0010";
    }
}
