package com.fast.common.utils;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;



/**
 * @author 喧嚣求静
 * 
 * blog:http://913.iteye.com
 */
public class DES3 {
	private final static String encodeKey = "h1k2#3s4f5d6%7d8s9@0s1f2";
	private final static String encodeIv = "20140305";
	private final static String decodeKey = "s1f2d3s4)5&6f7f8#9s0#1@2";
	private final static String decodeIv = "20140306";

	private final static String key = "liuyunqiang@lx100$#365#$";
	private final static String iv = "01234567";
	// 加解密统一使用的编码方式
	private final static String encoding = "utf-8";

	/**
	 * 3DES加密
	 * 
	 * @param plainText
	 *            普通文本
	 * @return
	 * @throws Exception
	 */
	public static String encode(String plainText) throws Exception {
		try {
			
			Key deskey = null;
			DESedeKeySpec spec = new DESedeKeySpec(encodeKey.getBytes());
			SecretKeyFactory keyfactory = SecretKeyFactory
					.getInstance("desede");
			deskey = keyfactory.generateSecret(spec);

			Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
			IvParameterSpec ips = new IvParameterSpec(encodeIv.getBytes());
			cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
			byte[] encryptData = cipher.doFinal(plainText.getBytes(encoding));
			return Base64.encode(encryptData);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 3DES解密
	 * 
	 * @param encryptText
	 *            加密文本
	 * @return
	 * @throws Exception
	 */
	public static String decode(String encryptText) throws Exception {
		try {
			Key deskey = null;
			DESedeKeySpec spec = new DESedeKeySpec(decodeKey.getBytes());
			SecretKeyFactory keyfactory = SecretKeyFactory
					.getInstance("desede");
			deskey = keyfactory.generateSecret(spec);
			Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
			IvParameterSpec ips = new IvParameterSpec(decodeIv.getBytes());
			cipher.init(Cipher.DECRYPT_MODE, deskey, ips);

			byte[] decryptData = cipher.doFinal(Base64.decode(encryptText));
			String data = new String(decryptData, encoding);
			
			return data;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
}
