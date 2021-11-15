package com.ict.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String[] hello(){
        return new String[] {"Hello", "World"};
    }

    // 임의로 주소와 출력 문구를 정해서 추가해보세요.
    @GetMapping("/write")
    public String[] write(){
        return new String[] {"1등만", "기억하는", "더러운 세상"};
    }
}
