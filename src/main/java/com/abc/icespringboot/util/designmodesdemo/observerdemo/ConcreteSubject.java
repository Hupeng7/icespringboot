package com.abc.icespringboot.util.designmodesdemo.observerdemo;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 10:41 2018/8/28 0028
 */
@Data
public class ConcreteSubject extends Subject {
    private String subjectState;
}
