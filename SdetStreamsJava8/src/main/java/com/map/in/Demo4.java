package com.map.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	int empSalary;
	
	public Employee(int empId, String empName, int empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	
	
}

// using Filter and Map
// first we apply filter then we perform map
public class Demo4 {
  public static void main(String[] args) {
	
	  List<Employee> list=Arrays.asList(
			  
			  new Employee(101, "Alex",10000),
			  new Employee(102, "Bairn",20000),
			  new Employee(103,"charles", 30000),
			  new Employee(104, "Darvin",40000),
			  new Employee(105,"Edward",50000)
			  
			  );
	  
	  
	   List<Integer> salary= list.stream()
	    .filter(e->e.empSalary>2000)
	    .map(e->e.empSalary)
	    .collect(Collectors.toList());
	   
	   System.out.println(salary); // [10000, 20000, 30000, 40000, 50000]
	 
	  
}
}
