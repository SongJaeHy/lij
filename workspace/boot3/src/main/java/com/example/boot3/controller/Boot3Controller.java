package com.example.boot3.controller;

import com.example.boot3.domain.BoDTO;
import com.example.boot3.domain.Boot3DTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@Log4j2
public class Boot3Controller {

    @GetMapping("/hello")
    public String hello(){
        log.info("Connected");
        return "hello";
    }

    @GetMapping("/hello2")
    public void hello2(Model model){
        List<Boot3DTO> list = IntStream.rangeClosed(1, 20).asLongStream()
                .mapToObj(i -> {
                    Boot3DTO dto = Boot3DTO.builder()
                            .sno(i)
                            .first("first : " + i)
                            .last("last : " + i)
                            .regTime(LocalDateTime.now())
                            .build();
                    return dto;
                }).collect(Collectors.toList());

        model.addAttribute("list", list);
    }

    @GetMapping("/hello2state")
    public void hello2state(Model model){
        List<Boot3DTO> list = IntStream.rangeClosed(1, 20).asLongStream()
                .mapToObj(i -> {
                    Boot3DTO dto = Boot3DTO.builder()
                            .sno(i)
                            .first("first : " + i)
                            .last("last : " + i)
                            .regTime(LocalDateTime.now())
                            .build();
                    return dto;
                }).collect(Collectors.toList());

        model.addAttribute("list", list);
    }


    @GetMapping("/hello3")
    public void hello3(Model model){
        List<BoDTO> list = IntStream.rangeClosed(1, 10).asLongStream()
                .mapToObj(i -> {
                    BoDTO dto = BoDTO.builder()
                            .bno(i)
                            .sno(i)
                            .name("name : " + i)
                            .regDate(LocalDateTime.now())
                            .build();
                    return dto;
                }).collect(Collectors.toList());

        model.addAttribute("list", list);
    }

    @GetMapping("/builderTest")
    public void builderTest(){
        IntStream.rangeClosed(1, 20).asLongStream()
                .forEach(i->{
                    log.info(i);
                });
    }


    @GetMapping("/inline")
    public String inline(RedirectAttributes redirectAttributes){

        Boot3DTO dto = Boot3DTO.builder()
                .sno(100L)
                .first("First : " + 100L)
                .last("Last : " + 100L)
                .regTime(LocalDateTime.now())
                .build();
        redirectAttributes.addFlashAttribute("result","success");
        redirectAttributes.addFlashAttribute("dto",dto);

        return "redirect:inlineView";
    }

    @GetMapping("/inlineView")
    public String inlineView(){
        return "inlineView";
    }

    @GetMapping("/name")
    public String name(Model model){
        model.addAttribute("name","송재현");
        return "name";
    }

    @GetMapping("/link")
    public String link(){
        return "link";
    }

}
