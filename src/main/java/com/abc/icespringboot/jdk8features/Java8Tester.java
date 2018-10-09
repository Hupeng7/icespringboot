package com.abc.icespringboot.jdk8features;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author hp
 * @version 1.0
 * @description: lambda表达式
 * @date: 13:36 2018/10/9 0009
 */
public class Java8Tester {
    /**
     * Lambda
     */
    @Test
    public void testLambda() {
        List<String> name1 = new ArrayList<String>();
        name1.add("Google");
        name1.add("Runoob");
        name1.add("Taobao");
        name1.add("Baidu");
        name1.add("Sina");

        List<String> name2 = new ArrayList<String>();
        name2.add("Google");
        name2.add("Runoob");
        name2.add("Taobao");
        name2.add("Baidu");
        name2.add("Sina");

        Java8Tester java8Tester = new Java8Tester();
        System.out.println("使用Java7 语法");
        java8Tester.sortUsingJava7(name1);
        System.out.println(name1);

        System.out.println("使用Java8 语法");
        java8Tester.sortUsingJava8(name2);
        System.out.println(name2);
    }

    private void sortUsingJava8(List<String> name2) {
        Collections.sort(name2, (s1, s2) -> s1.compareTo(s2));
    }

    private void sortUsingJava7(List<String> name1) {
        Collections.sort(name1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    @Test
    public void testLambda1() {
        Java8Tester tester = new Java8Tester();
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;
        //大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        //没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10+5 = " + tester.operate(10, 5, addition));
        System.out.println("10-5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10x5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10/5 = " + tester.operate(10, 5, division));

        //不用括号
        GreetingService greetingService = message -> System.out.println("Hello " + message);
        //用括号
        GreetingService greetingService1 = (message -> System.out.println("Hello " + message));
        greetingService.sayMessage("Runoob");
        greetingService1.sayMessage("Google");

        final String salutation = "Hello! ";
        GreetingService greetingService2 = message -> System.out.println(salutation + message);
        greetingService2.sayMessage("Runoob");

        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);


    }

    /**
     * lambda实现Runnable
     */
    @Test
    public void testLambdaRunnable() {
        //1.1 使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world 1");
            }
        }).start();

        //1.2 使用lambda expression
        new Thread(() -> System.out.println("hello world 2")).start();

        //2.1 使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world 3");
            }
        };

        //2.2使用lambda expression
        Runnable race2 = () -> System.out.println("hello world 4");

        //直接调用run 方法 (没开新的线程)
        race1.run();
        race2.run();


    }

    /**
     * 函数式编程
     */
    @Test
    public void testPredicate() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //Predicate<Integer> predicate = n -> true;
        /*
        n 是一个参数传递到Predicate 接口的test 方法
        n 如果存在则test 方法返回true
         */
        System.out.println("输出所有数据: ");
        eval(list, n -> true);

        /*
        Predicate<Integer> predicate = n->n%2 == 0
        n 是一个参数传递到 Predicate接口的test 方法
        如果n%2 为0 test的返回 true
         */
        System.out.println("输出所有偶数: ");
        eval(list, n -> n % 2 == 0);

        /*
        Predicate<Integer> predicate1 = n -> n>3
        n 是一个参数传递到Predicate 接口的test方法
        如果n 大于3 test方法返回true
         */
        System.out.println("输出大于3的所有数字: ");
        eval(list, n -> n > 3);

    }

    private void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n :
                list) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    private void eval1(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }


    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    interface Converter<T1, T2> {
        void convert(int i);
    }

    /**
     * 默认方法
     */
    @Test
    public void testDefaultMethod() {
        Vehicle vehicle = new Car();
        vehicle.print();
        Vehicle.blowHorn();

    }

    interface Vehicle {
        default void print() {
            System.out.println("我是一辆车");
        }

        static void blowHorn() {
            System.out.println("按喇叭!!!");
        }
    }

    interface FourWheeler {
        default void print() {
            System.out.println("我是一辆四轮车");
        }
    }

    class Car implements Vehicle, FourWheeler {
        @Override
        public void print() {
            //System.out.println("我是一辆四轮汽车");
            Vehicle.super.print();
        }

    }


}
