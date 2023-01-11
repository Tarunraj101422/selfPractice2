
public class Empl {
	private int id;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Empl(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empl [id=" + id + ", salary=" + salary + "]";
	}
	

}
