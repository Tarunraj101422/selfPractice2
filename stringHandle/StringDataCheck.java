package stringHandle;

public class StringDataCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Tarun";
		String s2 = "Tarun";
		System.out.println(s1==s2);   // == checks address of the objects. Allocated same memory for both variables.
		
		String s3 = new String("Tarun");        // new object is created here for string.
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		s1 = s2+"raj";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);     // after modification, new memory allocated for s2.
	}

}
