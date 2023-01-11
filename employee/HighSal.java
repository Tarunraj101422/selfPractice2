package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(1,"Tarun",25000.00));
		li.add(new Employee(2,"Raj",45000.00));
		li.add(new Employee(3,"Abhi",35000.00));
		/*
		 * Collections.sort(li, new SalComparator()); // Sorting based on salary using
		 * comparator ArrayList<String> al = new ArrayList<>();
		 * 
		 * for(Employee employee : li) { System.out.println(employee);
		 * al.add(employee.getEmpName()+"\t"+employee.getEmpSalary()+"\t"+employee.
		 * getEmpID()); } Collections.sort(al); for(String s:al) {
		 * System.out.println(s); }
		 * 
		 * ArrayList<Integer> al2 = new ArrayList<>(); for(Employee employee:li) {
		 * al2.add(employee.getEmpID());
		 * 
		 * } Collections.sort(al2); for(Integer i:al2) { System.out.println(i); }
		 */
		
		Collections.sort(li,(e1,e2) -> e1.getEmpSalary().compareTo(e2.getEmpSalary()));
		System.out.println("Sal -- "+li);
		Collections.sort(li,(e1,e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
		System.out.println("Name --"+li);
		
		
		
			System.out.println(li.get(li.size()-1));
			
			for(Employee employee:li) {
				if(employee.getEmpSalary()>30000) {
					System.out.println(employee.getEmpName()+"\t"+employee.getEmpSalary());
				}
			}
			
			
			/*
			 * for(Employee emp:li) { System.out.println(emp); }
			 */
		li.forEach((emp) -> {System.out.println(emp);});
		System.out.println(li.stream().findFirst());

		
		/*
		 * String a[] = new String[li.size()]; // Defining array size ArrayList<String>
		 * al = new ArrayList<>(); // creating new object for new array list
		 * for(Employee emp:li) { al.add(emp.getEmpName()); }
		 * 
		 * 
		 * al.toArray(a); // converting array list object to array Arrays.sort(a); //
		 * Sorting the array for(String s:a) { System.out.println(s); }
		 */
		
	}

}
