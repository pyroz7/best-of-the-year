package com.learning.bestoftheyear;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class indexController {
    @GetMapping
    public String year(Model model){
        model.addAttribute("year", 2023);
        model.addAttribute("name", "Serj");

        return "year";
    }
}
