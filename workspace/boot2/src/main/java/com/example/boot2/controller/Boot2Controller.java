package com.example.boot2.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class Boot2Controller {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
