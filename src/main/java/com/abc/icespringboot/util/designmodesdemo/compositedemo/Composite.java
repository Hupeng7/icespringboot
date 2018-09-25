package com.abc.icespringboot.util.designmodesdemo.compositedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:26 2018/9/3 0003
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(new String(String.valueOf(depth)) + name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
