package com.abc.icespringboot.util.designmodesdemo.compositedemo;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:31 2018/9/3 0003
 */
public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite composite = new Composite("Composite XY");
        composite.add(new Leaf("Leaf XYA"));
        composite.add(new Leaf("Leaf XYB"));
        comp.add(composite);

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);


    }
}
