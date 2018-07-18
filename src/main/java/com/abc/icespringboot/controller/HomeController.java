package com.abc.icespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 * @date 2018/4/20 0020
 */
@Controller
public class HomeController {
    @RequestMapping("/tohome")
    public String homePage(HttpSession session, Model model) {
        Object objectUser = session.getAttribute("sessionUser");
        return "/home/home";
    }
}
