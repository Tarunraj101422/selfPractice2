package arrays;

public class RefVariableExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(001,"Linga",20000);
		Emp e2 = new Emp(002,"Srinu",25000);
		Emp e3 = new Emp(003,"Venu",30000);
		Customer c1 = new Customer(123, "Tarun");
		Customer c2 = new Customer(456, "Nari");
		
		Object b[] = {e1,e2,e3,c1,c2};
		
		
		  for(int i=0; i<b.length; i++)
		  { 
			  System.out.println(b[i]); // using for loop 
		  }		
		
		  for(Object ob:b) 
		  { 
			  System.out.println(ob); // using for each loop
		  }	
		  int e[] = {}; // creating array with zero index is possible
		  System.out.println(e.length);
	}

}
