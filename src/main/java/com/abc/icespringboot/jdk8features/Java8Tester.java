package com.abc.icespringboot.jdk8features;

import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.time.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    /**
     * java8 stream实例
     */
    @Test
    public void testOne() {
        System.out.println("使用java 7: ");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println("列表: " + strings);
        long count = getCountEmptyStringUsingJava7(strings);
        System.out.println("空字符串数量为: " + count);

        count = getCountLength3UsingJava7(strings);
        System.out.println("字符串长度为3的数量为: " + count);

        //删除空字符串
        List<String> filtered = deleteEmptyStringUsingJava7(strings);
        System.out.println("筛选后的列表: " + filtered);

        //删除空字符串 并使用逗号把它们合并起来
        String mergedString = getMergedStringUsingJava7(strings, ",");
        System.out.println("合并字符串: " + mergedString);
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        //获取列表元素平方数
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("平方数列表: " + squaresList);
        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

        System.out.println("列表: " + integers);
        System.out.println("列表中最大数: " + getMax(integers));
        System.out.println("列表中最小数: " + getMin(integers));
        System.out.println("所有数之和: " + getSum(integers));
        System.out.println("平均数: " + getAverage(integers));
        System.out.println("随机数: ");
        //输出10个随机数
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
        }

        System.out.println("使用Java 8: ");
        System.out.println("列表: " + strings);
        count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符串数量为: " + count);

        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("字符串长度为3的数量为: " + count);

        filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选后的列表: " + filtered);

        mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("合并字符串: " + mergedString);

        squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
        System.out.println("列表: " + integers);

        IntSummaryStatistics statistics = integers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中的最大的数: " + statistics.getMax());
        System.out.println("列表中的最小的数: " + statistics.getMin());
        System.out.println("所有数之和: " + statistics.getSum());
        System.out.println("平均数: " + statistics.getAverage());
        System.out.println("随机数:");
        random.ints().limit(10).sorted().forEach(System.out::println);

        //并行处理
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("空字符串的数量为: " + count);


    }

    private int getAverage(List<Integer> integers) {
        return getSum(integers) / integers.size();
    }

    private int getSum(List<Integer> integers) {
        int sum = (int) (integers.get(0));
        for (int i = 1; i < integers.size(); i++) {
            sum += (int) integers.get(i);
        }
        return sum;
    }

    private int getMin(List<Integer> integers) {
        int min = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            Integer number = integers.get(i);
            if (number.intValue() < min) {
                min = number.intValue();
            }
        }
        return min;
    }

    private int getMax(List<Integer> integers) {
        int max = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            Integer number = integers.get(i);
            if (number.intValue() > max) {
                max = number.intValue();
            }
        }

        return max;
    }

    private List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<Integer>();
        for (Integer number :
                numbers) {
            Integer square = new Integer(number.intValue() * number.intValue());
            if (!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }

        return squaresList;
    }

    private String getMergedStringUsingJava7(List<String> strings, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string :
                strings) {
            if (!string.isEmpty()) {
                stringBuilder.append(string)
                        .append(separator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length() - 2);
    }

    private List<String> deleteEmptyStringUsingJava7(List<String> strings) {
        List<String> filteredList = new ArrayList<String>();
        for (String string :
                strings) {
            if (!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }

    private int getCountLength3UsingJava7(List<String> strings) {
        int count = 0;
        for (String string :
                strings) {
            if (string.length() == 3) {
                count++;
            }
        }

        return count;
    }

    private int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;
        for (String string :
                strings) {
            if (string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    /**
     * java8 Optional类
     */
    @Test
    public void testOptional() {
        Java8Tester java8Tester = new Java8Tester();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        //Optional.ofNullable - 允许传递为null参数
        Optional<Integer> a = Optional.ofNullable(value1);

        //Optional.of - 如果传递的参数是null ,抛出异常 NullPointException
        Optional<Integer> b = Optional.of(value2);
        System.out.println("sum(a,b) is: " + java8Tester.sum(a, b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //Optional.isPresent - 判断值是否存在
        System.out.println("第一个参数存在: " + a.isPresent());
        System.out.println("第二个参数存在: " + a.isPresent());

        // Optional.orElse -如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        // Optional.get - 获取值，值需要存在
        Integer value2 = b.get();

        System.out.println("value1 is : " + value1);
        System.out.println("value2 is : " + value2);
        return value1 + value2;

    }

    /**
     * 本地化日期时间 API
     */
    @Test
    public void testTime() {
        Java8Tester java8Tester = new Java8Tester();
        java8Tester.testLocalDateTime();
    }

    private void testLocalDateTime() {
        //获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("now time is: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1 : " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("month: " + month + ",day: " + day + ", seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2 : " + date2);

        // 12 December 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3 : " + date3);

        // 22 小时 15分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4 : " + date4);

        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5 : " + date5);
    }

    /**
     * 使用时区的日期时间api
     */
    @Test
    public void testZonedDateTime() {
        Java8Tester java8Tester = new Java8Tester();
        java8Tester.testZonedDateTimeMethod();
    }

    private void testZonedDateTimeMethod() {
        //获取当前时间日期
        ZonedDateTime date1 = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1 : " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("当时时区： " + currentZone);
    }

    /**
     * java8 base64
     */
    @Test
    public void testBase64() {
        try {
            String base64encodedString = Base64.getEncoder().encodeToString("hello base64?java8".getBytes("utf-8"));
            System.out.println("" + base64encodedString);

            //解码
            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);
            System.out.println("old String is: " + new String(base64decodedBytes, "utf-8"));
            base64encodedString = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
            System.out.println("Base64 encode's String(url) : " + base64encodedString);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                stringBuilder.append(UUID.randomUUID().toString());
            }

            byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
            String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
            System.out.println("Base64 encode String MIME : " + mimeEncodedString);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Error :" + e.getMessage());
        }


    }


}
