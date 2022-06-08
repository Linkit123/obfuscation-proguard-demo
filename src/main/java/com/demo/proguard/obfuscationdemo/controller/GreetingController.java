package com.demo.proguard.obfuscationdemo.controller;

import com.demo.proguard.obfuscationdemo.dto.GreetingDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("greetings")
    public String dashboard(Model model) {
        GreetingDTO greetingDTO = new GreetingDTO();
        greetingDTO.setMessage("Hello World");
        model.addAttribute("greetingDTO", greetingDTO);
        return "greeting";
    }
}
