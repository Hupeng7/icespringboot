package com.abc.icespringboot.util.encrypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @author hp
 * @version 1.0
 * @description: ${description}
 * @date: 15:31 2018/10/12 0012
 */
public class ASCEncrypt implements IEncrypt {

    private String key;

    public ASCEncrypt(String key) {
        this.key = key;
    }

    @Override
    public String encrypt(String string) {
        String base64Encode = null;
        try {
            base64Encode = base64Encode(aesEncryptToBytes(string, key));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return HexUtil.bytes2Hex(base64Encode.getBytes());
    }

    @Override
    public String decrypt(String string) {
        byte[] bytes = HexUtil.hex2Bytes(string);
        String aesDecrypt = null;
        try {
            String string2 = new String(bytes, "utf-8");
            aesDecrypt = aesDecrypt(string2, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aesDecrypt;
    }

    /**
     * 将base 64 code AES解密
     * @param encryptStr
     * @param decryptKey
     * @return
     * @throws Exception
     */
    public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
        return encryptStr.isEmpty() ? null : aesDecryptByBytes(base64Decode(encryptStr), decryptKey);
    }

    /**
     * AES解密
     * @param encryptBytes
     * @param decryptKey
     * @return
     * @throws Exception
     */
    public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128, new SecureRandom(decryptKey.getBytes()));

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES"));
        byte[] decryptBytes = cipher.doFinal(encryptBytes);

        return new String(decryptBytes);

    }

    /**
     * AES加密
     *
     * @param content
     * @param encryptKey
     * @return
     */
    public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128, new SecureRandom(encryptKey.getBytes()));

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES"));
        return cipher.doFinal(content.getBytes("utf-8"));

    }

    /**
     * base 64 encode
     * @param bytes
     * @return
     */
    public static String base64Encode(byte[] bytes) {
        return new BASE64Encoder().encode(bytes);
    }

    /**
     * base 64 decode
     * @param base64Code
     * @return
     * @throws Exception
     */
    public static byte[] base64Decode(String base64Code) throws Exception {
        return base64Code.isEmpty() ? null : new BASE64Decoder().decodeBuffer(base64Code);
    }

}
