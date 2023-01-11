package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          FileInputStream fis = new FileInputStream("E:\\Java classes\\Programs\\Practice\\src\\ioStream\\IO read file");
          int i;
          while(( i=fis.read()) != -1) {
        	  System.out.println((char)i+"...");
        	  System.out.println(i);
          }
          
          FileOutputStream fos = new FileOutputStream("E:\\Java classes\\Programs\\Practice\\src\\ioStream\\IO read file");
	        fos.write('t');
	}

}
