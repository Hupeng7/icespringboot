package com.abc.icespringboot.pojo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author Administrator
 * @date 2018/4/20 0020
 */

public class User implements Serializable {
    @NotEmpty(message = "id不能为空")
    private Integer id;
    @NotEmpty(message = "用户名不能为空")
    /**
     * @Pattern(regexp="^1[3|4|5|7|8][0-9]{9}$",message="用户名格式不正确")
     */
    @Email(message = "邮箱格式不正确")
    private String nickname;
    @NotEmpty(message = "手机号不能为空")
    private String phone;

    public User() {
    }

    public User(Integer id, String nickname, String phone) {
        this.id = id;
        this.nickname = nickname;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
