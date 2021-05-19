package com.company.functions.bifunction;


// TWO argument Function - BiFunction

import com.company.domain.Employee;
import com.company.domain.Manager;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionFunction {

//	BiFunction<Employee, Manager, Employee> empManagerBiFunction = (emp, manager) -> emp.getManager().getPersonalAssistant();
	BiFunction<Employee, Manager, Employee> empManagerBiFunction = (emp, manager) -> emp.getManager().getPersonalAssistant();
	Function<Employee, Employee> emplManagerFunction = emp -> emp.getManager().getPersonalAssistant();
	
	private void testBiFunction(Employee emp, Manager manager) {
		Employee employee = empManagerBiFunction.apply(emp, manager);
		System.out.println("Employee"+employee);
	}

	private void testAndThen(Employee emp, Manager manager) {
		BiFunction<Employee, Manager, Employee> perAssistant = empManagerBiFunction.andThen(emplManagerFunction);
		System.out.println(perAssistant);
		Employee pa = perAssistant.apply(emp, manager);
		System.out.println(pa);
	}

	public static void main(String[] args) {
		Employee emp = new Employee(99);
		Manager manager = new Manager();
		emp.setManager(manager);
		manager.setPersonalAssistant(emp);
//		new BiFunctionFunction().testBiFunction(emp, manager);
		new BiFunctionFunction().testAndThen(emp, manager);
	}
}
