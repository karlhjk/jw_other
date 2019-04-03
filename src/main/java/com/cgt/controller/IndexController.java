package com.cgt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String welcome(){
        return "index";
    }

    @RequestMapping("/common/{url}")
    public String common(@PathVariable String url){
        return url;
    }
}