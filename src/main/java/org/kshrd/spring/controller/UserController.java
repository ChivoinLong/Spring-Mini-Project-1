package org.kshrd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user-form")
    public String getUserForm(){
        return "user_form";
    }

    @RequestMapping("/user-list")
    public String getUserList(){
        return "user_list";
    }
}
