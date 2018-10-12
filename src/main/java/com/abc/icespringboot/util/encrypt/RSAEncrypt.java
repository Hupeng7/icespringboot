package com.abc.icespringboot.util.encrypt;

import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 17:08 2018/10/12 0012
 */
public class RSAEncrypt implements IEncrypt {
    private PublicKey publicKey;
    private PrivateKey privateKey;
    private String publicKeyString;
    private String privateKeyString;
    private Cipher cipher;

    public RSAEncrypt(PublicKey publicKey, PrivateKey privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    @Override
    public String encrypt(String string) {
        String afterEncrypt = null;
        try {
            //加解密类
            cipher = Cipher.getInstance("RSA");
            byte[] plainText = string.getBytes();

            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] enBytes = cipher.doFinal(plainText);
            afterEncrypt = HexUtil.bytes2Hex(enBytes);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return afterEncrypt;
    }

    @Override
    public String decrypt(String string) {
        byte[] bytes = HexUtil.hex2Bytes(string);
        String afterDecrypt = null;

        try {
            cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] deBytes = cipher.doFinal(bytes);
            publicKeyString = getKeyString(publicKey);
            privateKeyString = getKeyString(privateKey);
            afterDecrypt = new String(deBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return afterDecrypt;
    }

    /**
     * 得到密钥字符串 经过base64编码
     *
     * @param key
     * @return
     */
    public static String getKeyString(Key key) {
        byte[] keyBytes = key.getEncoded();
        return (new BASE64Encoder().encode(keyBytes));
    }
}
