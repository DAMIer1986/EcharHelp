package com.tonysoft.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectByte {
	public static byte[] ObjectToByte(Object obj) {
		byte[] bytes = null;
		try {
			// object to bytearray
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
			ObjectOutputStream oo = new ObjectOutputStream(bo);
			oo.writeObject(obj);

			bytes = bo.toByteArray();

			bo.close();
			oo.close();
		} catch (Exception e) {
			throw new RuntimeException("序列化失败！请检查对象是否实现序列化接口！");
		}
		return bytes;
	}

	public static Object ByteToObject(byte[] bytes) {
		Object obj = null;
		try {
			// bytearray to object
			ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
			ObjectInputStream oi = new ObjectInputStream(bi);

			obj = oi.readObject();
			bi.close();
			oi.close();
		} catch (Exception e) {
			throw new RuntimeException("反序列化失败！请检查接收对象是否正确及序列化ID是否改变！");
		}
		return obj;
	}
}
