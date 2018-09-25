package com.abc.icespringboot.util.designmodesdemo.compositedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:21 2018/9/3 0003
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(new String(String.valueOf(depth)) + name);
    }

}
