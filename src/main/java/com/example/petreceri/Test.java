package com.example.petreceri;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class Test {
    @GetMapping("/hello")
    private String hello(){
        return "hello";
    }

}
