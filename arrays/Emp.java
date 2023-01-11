package arrays;

public class Emp {
	private int id;
	private String name;
	private double salary;
	
	Emp(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;		
	}
	
	public String toString() {
		return ""+id+"\t"+name+"\t"+salary;
	}
}
