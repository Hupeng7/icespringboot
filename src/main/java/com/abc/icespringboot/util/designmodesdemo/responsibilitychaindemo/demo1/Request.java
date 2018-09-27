package com.abc.icespringboot.util.designmodesdemo.responsibilitychaindemo.demo1;

import lombok.Data;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 13:59 2018/9/27 0027
 */
@Data
public class Request {
    private String requestType;

    private String requestContent;

    private int number;

}
