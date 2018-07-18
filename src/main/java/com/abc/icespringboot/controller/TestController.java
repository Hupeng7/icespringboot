package com.abc.icespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @date 2018/4/18 0018
 */
@Controller
public class TestController {
    @RequestMapping(name = "/baseType", method = RequestMethod.GET)
    @ResponseBody
    public String baseType(int age) {
        return "age:" + age;
    }
}
