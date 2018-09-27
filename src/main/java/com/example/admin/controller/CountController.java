package com.example.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/count")
@Controller
public class CountController {
    @RequestMapping("/index")
    public String countIndex() {
        return "count";
    }
}
