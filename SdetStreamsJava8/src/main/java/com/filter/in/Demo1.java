package com.filter.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
  public static void main(String[] args) {
	
/*	  List<Integer> list= new  ArrayList<>();
	   
	  list.add(10);
	  list.add(15);
	  list.add(20);
	  list.add(25);
	  list.add(30);  */
	  
	  List<Integer> numbers=Arrays.asList(10,15,20,25,30,35,40,45,50,55,60);
	  
	  // filter even number from above list
	  
	  
	  List<Integer> evenNumbers=new ArrayList();
	  
	  /* without streams
	  for(Integer number:numbers) {
		  if(number%2==0) {
			  evenNumbers.add(number);
		  }
	  }
	  System.out.println(evenNumbers);// [10, 20, 30, 40, 50, 60] */
	  
	  // with streams
	  /* result is collected into list
        evenNumbers= numbers.stream().filter(n->n%2==0).collect(Collectors.toList());	
        
        
        * filter  input is predicate
        
        System.out.println(evenNumbers); // [10, 20, 30, 40, 50, 60] 
        
        */
	  // directly printing without list
	  
	  numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n)); // forEach input is consumer
	  
	  // or
	  numbers.stream().filter(n->n%2==0).forEach(System.out::println);
	  
}
}
