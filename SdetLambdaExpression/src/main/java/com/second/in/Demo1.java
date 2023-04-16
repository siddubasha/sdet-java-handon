package com.second.in;

import java.util.function.Predicate;

public class Demo1 {
  public static void main(String[] args) {
	  
	  // EX1:here taking an integer and comparing with 10 to know greater or lesser than 10
	  Predicate<Integer> p=i->(i>10);
	  System.out.println(p.test(20)); // true
	  System.out.println(p.test(5));  // false
	  
	  // EX2:checking length of string is >(greater) 4 or not
	  
	  Predicate<String> p2=s->(s.length()>4);
	  System.out.println(p2.test("siddu")); // true
	  System.out.println(p2.test("sid")); // false
	  
	  // EX3: print array elements whose size is > 4 from array
	  String names[]= {"siddu","ram","rakhi","basha"};
	  
	  for (String name : names) {
		if(p2.test(name)) {
			System.out.println(name);
		}
	}
}
}
