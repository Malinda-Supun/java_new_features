package com.company.interfaces.inheritance;

// Multiple Inheritance

interface Engine{
	default String model(int id){
		return "DEFAULT ENGINE";
	}
}

interface Vehicle extends Engine{
	default String model(int id){
		return "DEFAULT VEHICLE ENGINE";
	}
}
class Car implements Vehicle{

	@Override
	public String model(int id) {
		return Vehicle.super.model(id);
	}
}


public class MultipleInheritance {

	public static void main(String[] args) {
		System.out.println(new Car().model(1));
	}

}
