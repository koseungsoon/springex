package com.green.springex.controller;

import com.green.springex.dto.TodoDTO;
import com.green.springex.service.TodoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {


    private  TodoService todoService;




    @GetMapping("/list")
    public void list(){
        log.info("list-------GET---------");
    }

    @GetMapping("/register")
    public void registerGet(){
        log.info("GET todo register............");
    }

    @PostMapping("/register")
    public String registerPOST(TodoDTO todoDTO, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()) {
            log.info("has errors.......");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors() );
            return "redirect:/springex/todo/register";
        }

        log.info(todoDTO);

        todoService.register(todoDTO);


        return "redirect:/springex/todo/list";
    }

}
