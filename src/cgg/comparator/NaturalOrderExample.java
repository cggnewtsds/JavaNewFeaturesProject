package cgg.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NaturalOrderExample {

	public static void main(String[] args) {
       List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Davis",30));
		empList.add(new Employee("Martin",40));
		empList.add(new Employee("Alice",23));
		empList.add(new Employee("Martin",25));
		empList.add(new Employee("Barry",34));
		empList.add(new Employee("Martin",35));
		empList.add(new Employee("James",45));
		
		
		
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		
		System.out.println("Before Sorting..............");
		nameList.forEach(System.out::println);
		
		//nameList.sort(Comparator.naturalOrder());
		
		nameList.sort(Comparator.reverseOrder());
		
		System.out.println("------------------------------");
		nameList.forEach(System.out::println);
		
		

	}

}
