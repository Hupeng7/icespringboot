package com.abc.icespringboot.util.stringutils;


import com.abc.icespringboot.util.designmodesdemo.mementodemp.demo1.Test;
import org.apache.commons.lang3.StringUtils;


/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:21 2018/9/29 0029
 */
public class StringUtilsDemo {
    public static void main(String[] args) {
        /**
         *1、取得字符串的缩写
         *
         * 在给定的width内取得str的缩写,当testString的长度小于width则返回原字符串.
         * 注意：width参数至少为4（包括…）
         */
        String test = "This is a test of the abbreviation";
        String test2 = "Test";
        System.out.println(StringUtils.abbreviate(test, 15));
        System.out.println(StringUtils.abbreviate(test, 5, 15));
        System.out.println(StringUtils.abbreviate(test2, 10));

        /**
         * 查找嵌套字符串
         */
        String htmlContent = "ABC1234ABC4567";
        System.out.println(StringUtils.substringBetween(htmlContent, "1234", "4567"));
        System.out.println(StringUtils.substringBetween(htmlContent, "12345", "4567"));


        /**
         * 重复字符串
         */
        System.out.println(StringUtils.repeat("*", 10));
        System.out.println(StringUtils.repeat("China ", 5));

        /**
         * center
         * size 总长度
         */
        System.out.println(StringUtils.center("China", 11, "*"));

        /**
         * 颠倒字符串
         */
        System.out.println(StringUtils.reverse("ABCDEF"));

        /**
         * 空字符串检查
         * isBlank isNotBlank
         */
        String test3 = "";
        String test4 = "\n\n\t";
        String test5 = null;
        String test6 = "test";
        String test7 = "  ";
        //true
        System.out.println("test3 isBlank==>" + StringUtils.isBlank(test3));
        System.out.println("test4 isBlank==>" + StringUtils.isBlank(test4));
        System.out.println("test5 isBlank==>" + StringUtils.isBlank(test5));
        System.out.println("test6 isBlank==>" + StringUtils.isBlank(test6));
        System.out.println("test7 isBlank==>" + StringUtils.isBlank(test7));

        System.out.println("test3 isEmpty==>" + StringUtils.isEmpty(test3));
        System.out.println("test4 isEmpty==>" + StringUtils.isEmpty(test4));
        System.out.println("test5 isEmpty==>" + StringUtils.isEmpty(test5));
        System.out.println("test6 isEmpty==>" + StringUtils.isEmpty(test6));
        System.out.println("test7 isEmpty==>" + StringUtils.isEmpty(test7));

        /**
         * 判断字符串内容的类型
         */
        String test8 = "Virginia";
        System.out.println("test8 is 全由数字组成?==>" + StringUtils.isNumeric(test8));
        System.out.println("test8 is 全由字母组成?==>" + StringUtils.isAlpha(test8));
        System.out.println("test8 is 全由字母或数字组成?==>" + StringUtils.isAlphanumeric(test8));
        System.out.println("test8 is 全由字母或空格组成?==>" + StringUtils.isAlphanumericSpace(test8));

        /**
         * 取得某字符串在另一字符串中出现的次数
         */
        System.out.println(StringUtils.countMatches("Chinese People", "e"));

        /**
         * 字符串两端不能以指定的字符串中的字符开始或结尾
         */
        System.out.println(StringUtils.strip("Hello World", "ldH"));
        System.out.println(StringUtils.stripStart("Hello World", "H"));
        System.out.println(StringUtils.stripEnd("Hello World", "d"));

        /**
         * 删除或替换字符串中的某个字符
         */
        System.out.println(StringUtils.replace("Hello World", "o", "*"));
        System.out.println(StringUtils.replace("Hello World", "o", ""));

        /**
         * 判断是否字符串仅包含字符数组valid中的字符，
         * 即字符串中的字符是否都在字符数组中。
         * 如果str为null，则返回false;
         * 如果str为"",则返回true
         * return boolean
         */
        System.out.println(StringUtils.containsOnly(null, "*"));
        System.out.println(StringUtils.containsOnly("", '*'));
        System.out.println(StringUtils.containsOnly("afaf", 'a', 'f', ' '));

    }
}
