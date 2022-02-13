package com.examinapp.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value = "/")
public class Home {

    @GetMapping(value = "")
    public String GetHome() {
        return "index";
    }
}
