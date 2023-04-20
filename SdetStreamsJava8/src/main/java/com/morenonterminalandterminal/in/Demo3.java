package com.morenonterminalandterminal.in;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// findAny
// findFirst
public class Demo3 {
   public static void main(String[] args) {
	
	   List<String> list= Arrays.asList("one","two","three","one");
	   
	   // findAny() find an element in list return it
	   Optional<String> anyElement=list.stream().findAny(); //one
	   
	   System.out.println(anyElement.get());
	   
	   //findFirst() find first element from stream and return it
	   Optional<String> result=list.stream().findFirst();
	   
	   System.out.println(result.get());  // one
}
}
