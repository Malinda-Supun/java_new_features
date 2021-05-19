package com.company.functions.intro;

// What are functions?

import com.company.functions.predicate.Employee;

// Check if a movie is classic
interface Movie {
	boolean isClassic(int movieId);
}

interface Person{
	boolean isEmployee (int empId);
}

interface Hospital{
	void admit(Patient patient);
}

interface Predicate<T>{
	boolean test(T t);
}

public class WhatAreFunctions {

	public static void main(String[] args) {
	}
}
