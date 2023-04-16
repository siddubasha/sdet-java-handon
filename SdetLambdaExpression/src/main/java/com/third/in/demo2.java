package com.third.in;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class demo2 {
	public static void main(String[] args) {

		// EX1: returning salary of employee by taking employee object
		Function<Employee, Integer> f1 = e -> e.salary;

		Employee e1 = new Employee("sid", 82000);

		System.out.println(f1.apply(e1));

		// EX2: returning bonus for employee depending upon salary

		List<Employee> list = new ArrayList<>();

		list.add(new Employee("David", 50000));
		list.add(new Employee("Jhon", 30000));
		list.add(new Employee("Mary", 20000));

		Function<Employee, Integer> f2 = e -> {

			int salary = e.salary;

			if (salary >= 10000 && salary <= 20000) {
				return salary * 10 / 100;
			} else if (salary > 20000 && salary <= 30000) {
				return salary * 20 / 100;
			} else if (salary > 30000 && salary <= 40000) {
				return salary * 30 / 100;
			} else {
				return salary * 40 / 100;
			}

		};
		// if bonus is greater than 5000 only need to print
		Predicate<Integer> p1 = b -> b > 5000;

		for (Employee emp : list) {
			int bonus = f2.apply(emp);
			if (p1.test(bonus))
				System.out.println("Name: " + emp.name + " salary " + emp.salary + " bonus " + bonus);
		}
	}
}
