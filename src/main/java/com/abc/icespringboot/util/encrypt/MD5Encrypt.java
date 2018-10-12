package com.abc.icespringboot.util.encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:42 2018/10/12 0012
 */
public class MD5Encrypt implements IEncrypt {
    @Override
    public String encrypt(String string) {
        String md5Str = "";
        //加盐
        string += "lovecode";

        MessageDigest messageDigest = null;
        try {
            //1 创建一个提供信息摘要算法的对象 初始化为MD5算法对象
            messageDigest = MessageDigest.getInstance("MD5");

            //2 将消息变成byte数组
            byte[] input = string.getBytes();

            // 3 计算后获得字节数组 这就是那128位了
            byte[] buff = messageDigest.digest(input);

            //4 把数组每一字节 (一个字节占8位) 换成16进制连城MD5字符串
            md5Str = HexUtil.bytes2Hex(buff);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5Str;
    }

    /**
     * MD5不可解密
     *
     * @param string
     * @return
     */
    @Override
    public String decrypt(String string) {
        return null;
    }
}
