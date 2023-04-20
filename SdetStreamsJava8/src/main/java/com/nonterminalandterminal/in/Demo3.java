package com.nonterminalandterminal.in;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
   public static void main(String[] args) {
	
	   
	   List<String> list=Arrays.asList("A","B","C","1","2","3");
	    
	  Optional<String> reduced= list.stream().reduce((value1,value2)->{ return value1+value2;});
	  
	  System.out.println(reduced.get()); //ABC123     in return statement replace v1,v2  output: 321CBA
	  
	  
	  // converted stream objects in to arraya data  structure
	         Object arr[]= list.stream().toArray();
	         
	         for(Object a:arr) {
	        	 System.out.println(a);
	         }
	    
   
   }
   
}
