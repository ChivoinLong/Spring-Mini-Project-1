package org.kshrd.spring.controller;

import com.sun.media.sound.ModelPatch;
import org.kshrd.spring.model.User;
import org.kshrd.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService mUserService;

    @Autowired
    public UserController(UserService mUserService) {
        this.mUserService = mUserService;
    }


    @RequestMapping("/form")
    public String getUserForm(ModelMap map){
        map.addAttribute("USER", new User());
        map.addAttribute("IS_UPDATE", false);
        return "user_form";
    }

    @GetMapping("/list")
    public String getUserTest(ModelMap model){
        model.addAttribute("ALL_USERS", mUserService.findAllUsers());
        return "user_list";
    }

    @PostMapping("/save")
    public String getUserData(@ModelAttribute("USER") User user){
        mUserService.createNewUser(user);
        return "redirect:/user/list";
    }

    @RequestMapping("/delete")
    public String removeUserTest(@RequestParam("hashcode") String hashCode) {
        mUserService.deleteUserByHashcode(hashCode);
        return "redirect:/user/list";
    }

    @RequestMapping("/{hashcode}/update")
    public String modifyUserTest(@PathVariable("hashcode") String hashCode, ModelMap model) {
        model.addAttribute("USER", mUserService.findUserByHashcode(hashCode));
        model.addAttribute("IS_UPDATE", true);
        return "user_form";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("USER") User user, @RequestParam("hashcode") String hashCode) {
        mUserService.updateUserByHashcode(hashCode, user);
        return "redirect:/user/list";
    }

    @RequestMapping("/{hashcode}/detail")
    public String getUserByHashcodeTest(@PathVariable("hashcode") String hashCode, ModelMap model) {
        model.addAttribute("USER", mUserService.findUserByHashcode(hashCode));
        return "user_detail";
    }
}
