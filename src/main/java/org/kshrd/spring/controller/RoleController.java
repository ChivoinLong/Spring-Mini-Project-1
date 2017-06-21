package org.kshrd.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {

    @RequestMapping("/role-form")
    public String getRoleForm() {
        return "role_form";
    }

    @RequestMapping("/role-list")
    public String getRoleList() {
        return "role_list";
    }
}
