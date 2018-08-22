package com.abc.icespringboot.designmodes.strategypattern;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:40 2018/8/10 0010
 */
public enum Calculator {
    /**
     * 加法
     */
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    /**
     * 减法
     */
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public abstract int exec(int a, int b);


}
