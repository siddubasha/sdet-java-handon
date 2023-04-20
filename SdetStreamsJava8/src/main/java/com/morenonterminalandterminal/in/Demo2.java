package com.morenonterminalandterminal.in;

import java.util.HashSet;
import java.util.Set;

/*
 
 anyMatch(),allMatch(),noneMatch()
 */
public class Demo2 {
   public static void main(String[] args) {
	
	   Set<String> fruits= new HashSet<>();
	   
	   fruits.add("One apple");
	   fruits.add("One mango");
	   fruits.add("Two apples");
	   fruits.add("More apples");
	   fruits.add("Two guavas");
	   
	  // anyMatch()  any value start with One return true
	  boolean status1=fruits.stream().anyMatch(value->{return value.startsWith("One");});
	  
	  System.out.println(status1);  // true
	  
	  // allMatch()  all values start with One return true
	  boolean status2=fruits.stream().allMatch(value->{return value.startsWith("One");});
	  
	  System.out.println(status2);  //false
	  
	  
	  // noneMatch() all values not matched with one return true
      boolean status3=fruits.stream().noneMatch(value->{return value.startsWith("One");});
	  
	  System.out.println(status3);  //false

	  
}
}
