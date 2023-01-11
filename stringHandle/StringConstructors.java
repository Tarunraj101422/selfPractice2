package stringHandle;

public class StringConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		System.out.println("Direct string literal: "+s1);
		
		String s2 = new String();
		System.out.println("String object: " +s2);    // empty value, prints nothing
		
		char[] c = {'d','e','f'};
		String s3 = new String(c);   // converting char values to string
		System.out.println("Char to string: " +s3);
		
		byte[] b = {67,68,69};
		String s4 = new String(b);    // converting byte ascii values to string
		System.out.println("Byte to string: "+s4);
		
		String s5 = new String("Direct");                  // creating string with direct literal
		System.out.println("S5: "+s5);
		
		char c2 = 't';
		System.out.println("Char to string using method: " +String.valueOf(c2));
		System.out.println("Using char wrapper class: " +Character.toString(c2));

	}

}
