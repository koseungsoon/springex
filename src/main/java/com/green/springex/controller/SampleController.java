package com.green.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(){
        log.info("hello");
    }

    @GetMapping("/hi2")
    public String hello2(){
        log.info("hello2");
        return "aaa";
    }

    @GetMapping("/ex4")
    public void ex4(Model model){
        log.info("ex4");
        model.addAttribute ("message","nice");
    }
}
