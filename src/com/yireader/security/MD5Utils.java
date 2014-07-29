package com.yireader.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5�����㷨
 * 
 * @author Kevin
 * 
 */
public class MD5Utils {
	public String getMD5(byte[] source) {
		String encryptResult = null;
		// �������ֽ�ת����16���Ʊ�ʾ���ַ�
		char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(source);
			// MD5�ļ�������һ��128λ�ĳ����������ֽڱ�ʾΪ16���ֽ�
			byte[] tmp = messageDigest.digest();
			// ÿ���ֽ���16���Ʊ�ʾ�Ļ���ʹ��2���ַ�(��4λһ��,��4λһ��)�����Ա�ʾ��16������Ҫ32���ַ�
			char[] result = new char[16 * 2];
			int k = 0;// ת������ж�Ӧ���ַ�λ��

			for (int i = 0; i < 16; i++) {// ��MD5��ÿһ���ֽ�ת����16�����ַ�
				byte b = tmp[i];
				result[k++] = hexDigits[b >>> 4 & 0xf];// ���ֽڸ�4λ����16����ת��
				result[k++] = hexDigits[b & 0xf]; // ���ֽڵ�4λ����16����ת��

			}

			encryptResult = new String(result);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return encryptResult;
	}

	public static void main(String[] args) {
		String ss = "123456";
		System.out.print(new MD5Utils().getMD5(ss.getBytes()));
	}
}
