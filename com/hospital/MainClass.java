package com.hospital;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient("P1", 25, "Corona");
		Patient p2 = new Patient("P2", 26, "cold");
		Patient p3 = new Patient("P3", 28, "Corona");
		Patient p4 = new Patient("P4", 30, "fever");
		
         List<Patient> li = new ArrayList();
         li.add(p1);
         li.add(p2);
         li.add(p3);
         li.add(p4);
         
         System.out.println("All patients: " +li);
         
			/*
			 * //for(int i=0; i<li.equals("Corona"); i++) String dis = li.g
			 * if(p4.getDisease() == "Corona") { System.out.println("Corona patients:: "
			 * +li(i)); }
			 */
	}

}
