package com.morenonterminalandterminal.in;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
  public static void main(String[] args) {
	
	  List<String> animals=Arrays.asList("Dog","Cat","Elephant");
	  
	  List<String> birds=Arrays.asList("Dove","cock","Hen");
	  
	  
	  Stream<String> stream1=animals.stream();
	  
	  Stream<String> stream2=birds.stream();
	  
	  
	  List<String> finalList=Stream.concat(stream1, stream2).collect(Collectors.toList());
	  
	  
	  System.out.println(finalList);
}
}
