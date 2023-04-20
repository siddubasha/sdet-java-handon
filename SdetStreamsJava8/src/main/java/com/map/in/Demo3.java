package com.map.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
  public static void main(String[] args) {
	
	  List<Integer> numbers= Arrays.asList(2,3,4,5);
	  
	  // get collection of every number multiplied by  3
	  
	  // without streams
	   
/*	  List<Integer> result= new ArrayList<>();
	  
	  for(Integer number:numbers) {
		  result.add(number*3);
	  }
	  System.out.println(result); // [6, 9, 12, 15]  */
	  
	  // with streams
	  
	  List<Integer> result=numbers.stream().map(n->n*3).collect(Collectors.toList());
	  
	  System.out.println(result);  // [6, 9, 12, 15]
	  
	  
}
  
}
