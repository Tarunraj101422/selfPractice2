package exceptionHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("read.txt");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (IOException io) {
			io.getMessage();
		}

	}

}
