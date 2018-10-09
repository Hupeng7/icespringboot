package com.abc.icespringboot.jdk8features;

import java.lang.annotation.*;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 18:16 2018/10/8 0008
 */
public class RepeatingAnnotations {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();

        String value2();
    }

    @Filter(value = "filter1", value2 = "111")
    @Filter(value = "filter2", value2 = "222")
    public interface Filterable {

    }

    public static void main(String[] args) {
        for (Filter filter :
                Filterable.class.getAnnotationsByType(Filter.class)) {
            System.out.println(filter.value() + filter.value2());
        }
    }


}
