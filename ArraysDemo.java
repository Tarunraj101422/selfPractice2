
public class ArraysDemo {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
		int large = a[0];
        for (int i=0; i<a.length; i++) {
        	if(large<a[i]) {
        		large = a[i];
        	}
        }
        System.out.println(large);
        
        String s[] = {"S","R","Y","O"};
        String t[] = {s[0],s[3],s[1],s[1],s[2]};
        
        for (int i=0; i<5; i++) {
        	System.out.println(t[i]);
        }
        String st = "sorry";
        for(int i=0; i<5; i++) {
        	System.out.println(st);
        }
}
}
