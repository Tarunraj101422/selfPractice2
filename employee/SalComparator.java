package employee;

import java.util.Comparator;

public class SalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEmpSalary()<e2.getEmpSalary()) {
			return 1;
		} else {
			return -1;
		}		
	}	
}
