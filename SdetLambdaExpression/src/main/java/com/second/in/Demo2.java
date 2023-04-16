package com.second.in;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {

	String name;
	int salary;
	int experience;

	public Employee(String name, int salary, int experience) {
		super();
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}

}

public class Demo2 {
	public static void main(String[] args) {
          
		// EX1: 
		Employee emp= new Employee("siddu", 50000, 5);
		
		// lambda exp takes emp object return emp name if sal >30k and exp >3
		
		Predicate<Employee> p1=e->(e.salary>30000 && e.experience>3);
		
		System.out.println(p1.test(emp));
		
		//EX2: 
		List<Employee> list= new ArrayList<>();
		list.add(new Employee("Raghu", 60000, 2));
		list.add(new Employee("sekhar", 80000, 4));
		list.add(new Employee("suman",90000,8));
		list.add(emp);
		
        for(Employee employee : list) {
        	if(p1.test(employee)) {
        		System.out.println(employee.name+" "+employee.salary);
        	}
        }
		
	}
}
