package enumDemo;

import java.util.Scanner;

public class Validation {
	public static void Validation(String name) {
		if(!name.equals("Tarun")) {
			throw new UserDefinedException(ErrorCode.ERR4001.getCode(), ErrorCode.ERR4001.getMessage());
		} else {
			System.out.println("Login success");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         System.out.println("Please enter user name");
         String name = s.next();
         
        try{
        	Validation(name);
        } catch(UserDefinedException u){
        	System.out.println("Error:: " +u.getMessage());
        }
	}
	}
