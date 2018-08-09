package com.abc.icespringboot.designModes.singletonPattern;

/**
 * 懒加载 使用时候创建对象
 *
 * 解决办法：
 * 在getSingleton方法前加synchronized关键字，
 * 也可以在getSingleton方法内增加synchronized来实现。最优的办法是如通用代码那样写。
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getSingletonLazy() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
