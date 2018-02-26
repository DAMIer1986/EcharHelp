package com.tonysoft.util;
import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;
public class JSONTools {
	/**
	 * @param obj
	 * @return
	 * 对象转化为jSON字符串
	 */
	public static String convertObj2JsonStr(Object obj){
		return JSON.toJSONString(obj);
	}
	/**
	 * @param
	 * @return
	 * jSON字符串转化为集合
	 */
	public static  <T>List<T> convertJson2Collection(String s,Class<T> c){
		List<T> cc = null;
		try {
			cc = JSON.parseArray(s, c);  
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cc;
	}
	
	/**
	 * @param s
	 * @param c
	 * @return
	 * 字符串转化为对象
	 */
	public static <T>Object convertJson2Class(String s,Class<T> c){
		Object obj = null;
		try {
			obj = JSON.parseObject(s, c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return obj;
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String args[]){
		String s = "{\"id\":123,\"name\":\"gouliren\"}";
		Map m = (Map)JSONTools.convertJson2Class(s, Map.class);
		System.out.println(m);
	}
}
