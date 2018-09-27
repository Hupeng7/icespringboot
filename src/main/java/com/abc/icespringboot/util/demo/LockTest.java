package com.abc.icespringboot.util.demo;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:09 2018/9/25 0025
 */
public class LockTest {
    private ArrayList<String> arrayList = new ArrayList<>();
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final LockTest lockTest = new LockTest();
        for (int i = 0; i < 3; i++) {
            final Integer count = i;
            new Thread("甲") {
                @Override
                public void run() {
                    lockTest.insertSync(Thread.currentThread(), count);
                }
            }.start();

            new Thread("乙") {
                @Override
                public void run() {
                    lockTest.insertSync(Thread.currentThread(), count);
                }
            }.start();
        }

        lockTest.arrayList.stream().forEach(e -> {
            System.out.println(e);
        });

    }

    public void insert(Thread thread, Integer count) {
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                arrayList.add("第" + count + "次 线程" + thread.getName() + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

//    在同步代码块中，同步锁就是这个代码块所属的那个对象
//    在同步方法中（非静态），同步锁就是调用这个方法的那个对象
//    在同步方法中（静态），同步锁就是这个方法所属的这个类的字节码文件，即 类名.class;
    public synchronized void insertSync(Thread thread, Integer count) {
        for (int i = 0; i < 5; i++) {
            arrayList.add("第" + count + "次 线程" + thread.getName() + i);
        }
    }


}
