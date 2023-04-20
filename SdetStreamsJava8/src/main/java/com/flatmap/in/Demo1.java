package com.flatmap.in;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
  public static void main(String[] args) {
	
	  //Map
	  
	  List<Integer> list1=Arrays.asList(1,2,3,4,5);
	  List<Integer> list2=list1.stream().map(n->n+10).collect(Collectors.toList());
	  System.out.println(list2); //[11, 12, 13, 14, 15]
	  
	  // FlatMap
	  // if we need to deal with complex collections i.e collection of collections , then we use flatmap
	  List<Integer> lst1=Arrays.asList(1,2);
	  List<Integer> lst2=Arrays.asList(3,4);
	  List<Integer> lst3=Arrays.asList(5,6);
	  
	  List<List<Integer>> finalList=Arrays.asList(lst1,lst2,lst3);
	  
	 List<Integer> result=finalList.stream().flatMap(c->c.stream()).collect(Collectors.toList());
	 
	 System.out.println(result); //[1, 2, 3, 4, 5, 6]
	 
	 List<Integer> result1=finalList.stream().flatMap(c->c.stream().distinct().map(n->n+10)).collect(Collectors.toList());
	 
	 System.out.println(result1); //[11, 12, 13, 14, 15, 16]
	 
	  
	  
}
}
