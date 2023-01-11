package arrays;

public class Customer {
	private int cid;
	private String cname;
	
	Customer(int cid, String cname){
		this.cid = cid;
		this.cname = cname;
	}
	
	public String toString() {
		return ""+cid+"\t"+cname;
	}
}
