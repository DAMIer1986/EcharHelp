package com.tonysoft.util;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;

public class MD5util {
	
	public static final String KEY = "HR";
	
	public static String md5(String src){
		try {
			MessageDigest md
				=MessageDigest.getInstance("MD5");
			src = src + KEY;
			//MD5加密处理
			byte[] output
					=md.digest(src.getBytes());
			//Base64处理
			String ret
					=Base64.encodeBase64String(output);
			return ret;
		} catch (Exception e) {
			throw new RuntimeException("密码加密失败",e		);
		}
	}
}
