package com.abc.icespringboot.util.encrypt;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 16:25 2018/10/12 0012
 */
public interface IEncrypt {
    String encrypt(String string);

    String decrypt(String string);
}
