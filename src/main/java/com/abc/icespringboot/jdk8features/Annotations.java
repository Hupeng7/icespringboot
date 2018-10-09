package com.abc.icespringboot.jdk8features;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author hp
 * @version 1.0
 * @description: 新增类型注解: ElementType.TYPE_USE 和ElementType.TYPE_PARAMETER(在Target上)
 *
 * @date: 9:46 2018/10/9 0009
 */
public class Annotations {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
    public @interface NonEmpty {

    }

    public static class Holder<@NonEmpty T> extends @NonEmpty Object {
        public void method() throws @NonEmpty Exception {

        }
    }

    public static void main(String[] args) {
        final Holder<String> holder = new @NonEmpty Holder<String>();
        @NonEmpty Collection<@NonEmpty String > strings = new ArrayList<>();
    }


}
