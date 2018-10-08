package com.abc.icespringboot.util.randomobjectvalue;

import java.lang.annotation.*;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:54 2018/9/30 0030
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FormatAnnotation {

    /**
     * 日期的格式
     *
     * @return
     */
    String dataFormat() default "yyyy-MM-dd hh:mm:ss";

    /**
     * list集合的长度
     *
     * @return
     */
    String listLength() default "4";

    /**
     * map集合的长度
     *
     * @return
     */
    String mapLength() default "4";


}
