package com.abc.icespringboot.util.jsondemo;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author Administrator
 * @date 2018/4/20 0020
 */
@Data
public class UserA implements Serializable {
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
    private Dog dog;


}
