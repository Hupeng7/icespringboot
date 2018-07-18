package com.abc.icespringboot.controller;

import com.abc.icespringboot.pojo.User;
import com.abc.icespringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/4/20 0020
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    //@ResponseBody
    public String findAll(Integer id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        System.out.println(user);
        return "test";
    }

}
