package com.four.in;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {

	String name;
	int salary;
	String gender;

	public Employee(String name, int salary, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

}
public class Demo2 {
     
	public static void main(String[] args) {
		
		List<Employee> list= new  ArrayList<>();
		
		list.add(new Employee("David", 50000, "Male"));
		list.add(new Employee("Jhon", 30000, "Male"));
		list.add(new Employee("Mary", 20000, "Female"));
		list.add(new Employee("Scott", 60000, "Male"));
		// Function interface (will get bonus)
		Function<Employee, Integer> f1=e->(e.salary*10)/100;
		// Predicate interface( conditional check bonus is >= 5000)
		Predicate<Integer> p=b->b>=5000;
		// Consumer interface
		Consumer<Employee> c=e->System.out.println("Name: "+e.name+" Salary: "+e.salary+" Gender: "+e.gender);
		
		
		for (Employee employee : list) {
			int bonus=f1.apply(employee);
			if(p.test(bonus)) {
				c.accept(employee);
				System.out.println(bonus);
			}
		}
	
}
}
