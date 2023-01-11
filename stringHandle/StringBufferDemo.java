package stringHandle;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("Tarun");
		StringBuffer sb2 = new StringBuffer("Tarun");
		StringBuffer sb3 = sb1.append("raj");
		System.out.println(sb1 == sb3);
		System.out.println(sb3);
		
		/*  the main difference between string and stringBuffer is
		 *  if we modify the string also, it will be in same memory location
		 *  But in string, it will be save in different memory location
		*/

		
		StringBuffer sb4 = sb2.reverse();
		System.out.println(sb4);
		
		
		System.out.println(sb1.equals(sb2));   // equals method will not override for stringBuffer object.
                                               // Hence it cannot compare content and return false only.
	}

}
