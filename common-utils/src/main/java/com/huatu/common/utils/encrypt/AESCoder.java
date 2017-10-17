package com.huatu.common.utils.encrypt;

import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.security.Key;

/**
 * java加密技术-by梁栋
 *
 * @author hanchao
 * @date 2017/10/17 21:58
 */
public class AESCoder {
    private static final String ALGORITHM = "AES";


    /**
     * 解密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] data, String key) throws Exception {
        Key k = SecretKeyCoder.initKey(ALGORITHM,key);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, k);

        return cipher.doFinal(data);
    }

    /**
     * 加密
     *
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, String key) throws Exception {
        Key k = SecretKeyCoder.initKey(ALGORITHM,key);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, k);

        return cipher.doFinal(data);
    }

    public static String decryptWithBase64(String data,String key) throws Exception {
        return new BASE64Encoder().encode(decrypt(data.getBytes(),key));
    }

    public static String encryptWithBase64(String data,String key) throws Exception {
        return new BASE64Encoder().encode(encrypt(data.getBytes(),key));
    }

}

