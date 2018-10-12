package com.abc.icespringboot.util.encrypt;

import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:58 2018/10/12 0012
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /**
         * md5
         */
        String pwd = "thisispwd";
        System.out.println("md5加密后\t" + new MD5Encrypt().encrypt(pwd));

        /**
         * asc 对称加密
         */
        String ascKey = "this is ascKey";
        String afterASCEncrypt = new ASCEncrypt(ascKey).encrypt(ascKey);
        System.out.println("asc加密后: \t" + afterASCEncrypt);
        System.out.println("asc解密后: \t" + new ASCEncrypt(ascKey).decrypt(afterASCEncrypt));

        /**
         *  rsa 非对称加密
         */
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        // 密钥位数
        keyPairGenerator.initialize(1024);
        // 密钥对
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        // 公钥
        PublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        // 私钥
        PrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

        RSAEncrypt rsaEncrypt = new RSAEncrypt(publicKey, privateKey);
        String afterRSAEncrypt = rsaEncrypt.encrypt(pwd);
        System.out.println("rsa加密后: \t" + afterRSAEncrypt);
        System.out.println("rsa解密后: \t" + rsaEncrypt.decrypt(afterRSAEncrypt));


    }
}
