package com.abc.icespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @date 2018/4/20 0020
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "redirect:/index.jsp";
    }
}
