package ioStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		String filePath = "E:\\Java classes\\Programs\\Practice\\src\\ReadWrite1.txt";
		try {
			fos = new FileOutputStream(filePath);
			DataOutputStream dos = new DataOutputStream(fos);
			try {
				dos.write(123);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				dos.writeUTF("TArunraj");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException fn) {
			System.out.println("File is not found " + fn.getMessage());
		} finally {
			try {
				if (null != fos)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Written successfully");
		

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			DataInputStream dis = new DataInputStream(fis);
			try {
				System.out.println(dis.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException fn) {
			System.out.println("File is not found " + fn.getMessage());
		} finally {
			try {
				if (null != fis) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
