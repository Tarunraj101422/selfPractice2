package collectionFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		try {
		FileInputStream fis = new FileInputStream("E:\\Java classes\\Programs\\Practice\\src\\collectionFramework\\test.properties");
		p.load(fis);
		 System.out.println(p);
		System.out.println("Usename: "+p.getProperty("Username"));
		
		p.setProperty("password", "12345");		
		FileOutputStream fos = new FileOutputStream("E:\\Java classes\\Programs\\Practice\\src\\collectionFramework\\test.properties");
		
		p.store(fos, "Updated by Tarun");
		
		}catch(IOException io) {
			System.out.println("Try again ");
			io.printStackTrace();
		}
		
	}


}
