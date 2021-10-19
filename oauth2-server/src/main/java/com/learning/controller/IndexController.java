package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Model model, ModelMap modelMap) {

        model.addAttribute("hello", "thymeleaf");

        modelMap.addAttribute("hi", "thymeleaf");

        return "index";
    }
}
