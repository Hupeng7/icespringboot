package com.abc.icespringboot.util.jsondemo;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 9:33 2018/8/23 0023
 */
@Slf4j
@Component
public class JsonDemo {
    public static void main(String[] args) {
        UserA user = new UserA();
        user.setId(111);
        user.setNickname("Jack");
        user.setPhone("135111111");

        Dog dog = new Dog();
        dog.setColor("白");
        dog.setName("666");
        user.setDog(dog);

        String s = JsonUtil.toJSONString(user);
        UserA u1 = JSON.parseObject(s, UserA.class);

        log.info(u1.toString());
        System.out.println(u1.toString());
        System.out.println(user.toString());
    }
}
