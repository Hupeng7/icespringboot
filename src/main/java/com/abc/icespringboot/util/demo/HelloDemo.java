package com.abc.icespringboot.util.demo;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:40 2018/8/10 0010
 */
public class HelloDemo {
    public static void main(String[] args) {
        String[] strings = new String[]{"aaa", "bbb"};
        List<String> list = Arrays.asList(strings);
        //strings[0] = "change";

        System.out.println(list.get(0));
        System.out.println();

        List<String> list1 = new ArrayList<String>() {
            {
                add("aaa");
                add("bbb");
                add("ccc");
                add("ddd");
            }
        };
        /**
         * 使用迭代器 Iterator
         * 不要在 foreach 循环里进行元素的 remove/add 操作。
         * remove 元素请使用 Iterator方式，
         * 如果并发操作，需要对 Iterator 对象加锁。
         */
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("bbb".equals(item)) {
                System.out.println("item===========>" + item);
                iterator.remove();
            }
        }
        System.out.println(list1);

        /**
         * map
         */
        Map<String, Integer> map = new HashMap<String, Integer>(16) {
            {
                put("a", 1);
                put("b", 2);
                put("c", 3);
                put("d", 4);
            }
        };

        System.out.println("map 遍历");
        for (String key : map.keySet()) {
            System.out.println(key + "：" + map.get(key));
        }

        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<String, Integer>(5) {
            {
                put("Chinese", 10);
                put("Math", 9);
                put("English", 8);
                put("", 7);
                //put(null, 6);
            }
        };

        System.out.println("\n concurrentHashMap 遍历1");
        for (Map.Entry<String, Integer> entry :
                concurrentHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /**
         *  使用keySet()遍历
         */
        System.out.println("\n concurrentHashMap 遍历2");
        Iterator<String> iterator1 = concurrentHashMap.keySet().iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println(key + "：" + concurrentHashMap.get(key));
        }

        /**
         *  使用entrySet()遍历
         */
        System.out.println("\n concurrentHashMap 遍历3");
        Iterator<Map.Entry<String, Integer>> iterator2 = concurrentHashMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = iterator2.next();
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }

        System.out.println("LocalDateTime: " + LocalDateTime.now().toString());

        System.out.println("LocalDateTime withYear: " + LocalDateTime.now().toString());

        int a;
        for (int i = 0; i < concurrentHashMap.size(); i++) {
            a = ThreadLocalRandom.current().nextInt(1000, 10000);
            System.out.println("ThreadLocalRandom 随机数第" + i + "个是 :" + a);
        }

        System.out.println(ThreadLocalRandom.current().ints(10L, 1, 10));

        LongAdder longAdder = new LongAdder();
        for (int i = 0; i < concurrentHashMap.size(); i++) {
            longAdder.add(2);
            System.out.println("LongAdder 第" + i + "次自增 :" + longAdder);
        }

    }

    /**
     * 卫语句
     */
    public void doWhat(int a) {
        int minNumber = 1000;
        int maxNumber = 9999;
        if (a == minNumber) {
            System.out.println("do thing one");
            return;
        }
        if (a == maxNumber) {
            System.out.println("do thing two");
            return;
        }
        System.out.println("do thing three");
        return;
    }
}
