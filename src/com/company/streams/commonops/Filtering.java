package com.company.streams.commonops;
import com.company.domain.Employee;
import com.company.util.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;


//Filtering operation
public class Filtering {
	List<Employee> employees = EmployeeUtil.createEmployees();
	
	private void testFiltering() {
		Stream<Employee> empStream = employees
				.stream()
				.filter(Employee::isSenior)
				.filter(e -> e.getDepartment().equals("Marketing"))
				.filter(Employee::isExecutive);
		empStream.forEach(System.out::println);
	}
	public static void main(String[] args) {
		new Filtering().testFiltering();
	}

}
