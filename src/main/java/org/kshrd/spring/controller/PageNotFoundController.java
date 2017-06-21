package org.kshrd.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageNotFoundController {

    @RequestMapping("/pagenotfound")
    public String get404Page(){
        return "not_found";
    }
}
