package com.downandupCasting;

public class UpDownMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c = new Child();
       c.start();
       c.m2();
       c.m1();
       
       
       Parent p = new Parent();
       p.start();
       p.m1();
       
       p = new Child();  //upcasting
       
        ((Child)p).m1();
      
       Parent p1 = new Child();
       Child c2 = (Child)p1;
     
	}

}
