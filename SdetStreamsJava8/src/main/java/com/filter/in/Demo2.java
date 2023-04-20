package com.filter.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
  public static void main(String[] args) {
	
	  List<String> names=Arrays.asList("Siddubasha","sansa","Daerneys","Joffery");
	  
	  List<String> longNames=new ArrayList();
	  
	  
	  // filter names if length of  name >6 and <8
	  
	  longNames=names.stream().filter(s->s.length()>6&&s.length()<8).collect(Collectors.toList());
	  System.out.println(longNames);
	  
	  // or
	  names.stream().filter(s->s.length()>6&&s.length()<8).forEach(n->System.out.println(n));
	  //or
	  names.stream().filter(s->s.length()>6&&s.length()<8).forEach(System.out::println);
	  
}
}
