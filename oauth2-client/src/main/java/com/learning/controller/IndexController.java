package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by macro on 2019/10/11.
 */
@Controller
public class IndexController {
    @Autowired
    private UserController userController;



    @RequestMapping(value = "/index")
    public String index(Model model, ModelMap modelMap) {

        model.addAttribute("hello", "thymeleaf");

        modelMap.addAttribute("hi", "thymeleaf");

        return "index";
    }

}
