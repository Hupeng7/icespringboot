package com.abc.icespringboot.controller;

import java.util.Scanner;

/**
 * @author Administrator
 * @date 2018/5/25 0025
 */
public class JavaShellTest {
    public static void main(String[] args) {
        while (true) {
            System.out.println("please input a word===>");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            if ("end".equalsIgnoreCase(str)) {
                //language=JSON
                String jsonString = "{\"name\":\"zhangsan\",\"age\":\"18\"}";
                System.out.println(jsonString);
                System.out.println("The program is end");
                break;
            } else {
                System.out.println("the word is: " + str + ",you can exit the loop if you push 'end'");
            }
            if (str == null) {

            }
        }

    }
}
