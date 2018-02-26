package mytest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import com.tonysoft.util.MD5util;

public class MD5Test {

	@Test
	public void Test1() {
		System.out.println(MD5util.md5("123456"));
	}
	
	@Test
	public void Test2() {
		Properties pps = new Properties();
        try {
			pps.load(new FileInputStream("./fileUpload.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        String path = pps.getProperty("path");
        System.out.println(path);
	}
}
