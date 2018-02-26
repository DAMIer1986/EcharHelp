package com.tonysoft.util;

public class StringIsNull {

	public static boolean IsNullOrEmpty(String str) {
		if(str == null || str.trim().isEmpty() || str.equals("null")) {
			return true;
		}
		return false;
	}
}
