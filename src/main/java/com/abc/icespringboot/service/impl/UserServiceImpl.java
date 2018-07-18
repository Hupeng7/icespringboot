package com.abc.icespringboot.service.impl;

import com.abc.icespringboot.mapper.UserMapper;
import com.abc.icespringboot.pojo.User;
import com.abc.icespringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/4/20 0020
 */
@Service
//@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
