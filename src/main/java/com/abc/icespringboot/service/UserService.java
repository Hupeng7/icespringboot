package com.abc.icespringboot.service;

import com.abc.icespringboot.pojo.User;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/4/20 0020
 */
public interface UserService {
    /**
     * 通过id查询
     * @param id
     * @return
     */
    User findById(int id);
}
