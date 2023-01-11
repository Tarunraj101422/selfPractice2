package wrapperClasses;

public class WrappingAndUnwrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(a);    // printing primitive data type
		
		Integer a1 = new Integer(a);		
		System.out.println(a1);        //  converting primitive to object type
		
		Integer a2 = Integer.valueOf(a); 
		System.out.println(a2);       // converting object to primitive type
		
		/* From java 1.5 Developers can convert implicitly
		 * No need to create object
		 */
		
		int b = 15;
		Integer b2 = b;               // wrapping
		System.out.println(b2);
		int b3 = Integer.valueOf(b);  // Unwrapping
		System.out.println(b3);

	}

}
