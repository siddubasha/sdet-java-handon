package com.filter.in;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
  public static void main(String[] args) {
	
	  List<String> words=Arrays.asList("cup",null,"forest","sky","book",null,"theater");
	  
	  System.out.println(words); //[cup, null, forest, sky, book, null, theater]
	  
	  // remove nulls from collection
	  
	 List<String> result= words.stream().filter(s->s!=null).collect(Collectors.toList());
	 
	 System.out.println(result); // [cup, forest, sky, book, theater]
	 
	
}
}
