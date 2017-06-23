package org.kshrd.spring.controller;

import org.kshrd.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Obi-Voin Kenobi on 18-Jun-17.
 */

@Controller
public class DashboardController {

    private UserService mUserService;

    @Autowired
    public DashboardController(UserService mUserService) {
        this.mUserService = mUserService;
    }


    @GetMapping({"/dashboard", "/"})
    private ModelAndView getDashboard() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dashboard");
        mv.addObject("USER_NUM", mUserService.findUserNumber());
        mv.addObject("FEMALE_NUM", mUserService.findFemaleUserNumber());
        mv.addObject("MALE_NUM", mUserService.findMaleUserNumber());
        return mv;
    }
}
