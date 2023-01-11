package ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			String filePath = "E:\\Java classes\\Programs\\Practice\\src\\ReadWrite.txt";
			fis = new FileInputStream(filePath);
            int i;
			while ((i = fis.read()) != -1) {
                    System.out.println((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found  " + e.getMessage());

		} finally {
			try {
				if(null != fis) {      //if there is connection, then we need to close it.
			fis.close();
			System.out.println("Connection closed");
				}
				} catch(IOException e) {
			System.out.println("Connection is not closed " +e.getMessage());
		}
		}
	}

}
