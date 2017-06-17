package org.kshrd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Obi-Voin Kenobi on 18-Jun-17.
 */

@Controller
public class DashboardController {

    @GetMapping({"/dashboard", "/"})
    private ModelAndView getDashboard() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dashboard");

        return mv;
    }
}
