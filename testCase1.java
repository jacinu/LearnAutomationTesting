package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testCase1 {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		//1.FileInputStream class accepts a constructor
		//2.Constructor will be the path of the file
		FileInputStream fi = new FileInputStream("C:\\Users\\jacin\\Documents\\GITHUB learning\\LearnAutomationTesting\\JavaPropertiesExcel\\src\\config\\object.properties");
		prop.load(fi);
		
		System.out.println(prop.getProperty("Course"));
	}

}
