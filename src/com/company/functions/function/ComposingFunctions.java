package com.company.functions.function;

import com.company.domain.Address;
import com.company.domain.Employee;
import com.company.domain.Manager;

import java.util.function.Function;

// Composing Function functions
public class ComposingFunctions {

    Function<Employee, Manager> managerFinder = (emp) -> getManager(emp);
    Function<Manager, Employee> assistantFinder = (manager) -> getPersonalAssistant(manager);

    // andThen method
    private void testAndThen(Employee emp) {
        Function<Employee, Employee> empManagerAssistantFinder = managerFinder.andThen(assistantFinder);
        empManagerAssistantFinder.apply(emp);
    }

    // compose method
    private void testCompose(Employee emp) {
        Function<Employee, Employee> empFinder = assistantFinder.compose(managerFinder);
    }

    private void testIdentity() {
        Function<String, String> id = Function.identity();

        String result = id.apply("ID12EFL");

        System.out.println("Result: " + result);
    }

    private Employee getPersonalAssistant(Manager manager) {
        System.out.println(manager.getPersonalAssistant());
        return manager.getPersonalAssistant();
    }

    private Manager getManager(Employee emp) {
        System.out.println(emp.getManager());
        return emp.getManager();
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1);
        Manager manager = new Manager();
        emp.setManager(manager);
//		new ComposingFunctions().testAndThen(emp);
//		new ComposingFunctions().testCompose(emp);
        new ComposingFunctions().testIdentity();
    }

    private Address getAddress(Employee employee) {
        return employee.getAddress();
    }

    private Employee getEmployee(int id) {
        return new Employee(id);
    }

}
