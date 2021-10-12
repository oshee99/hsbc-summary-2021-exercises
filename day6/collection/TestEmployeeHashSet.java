package beans;

import java.util.HashSet;
import java.util.Set;

public class TestEmployeeHashSet {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(102, "Alex", 20000, "Finance"));
		employees.add(new Employee(101, "Charles", 40000, "Finance"));
		employees.add(new Employee(100, "Bruce", 50000, "Sales"));
		employees.add(new Employee(104, "David", 30000, "Sales"));
		employees.add(new Employee(104, "Edward", 60000, "Sales"));
		System.out.println("Size: "+employees.size());
		System.out.println("--- Iterating ----");
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}

}
