package com.map.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
  public static void main(String[] args) {
	  List<String> vehicles =Arrays.asList("aeroplane","car","bike","cycle","car");
	  
	  // get the collection of length of every string 
	  
	  // without streams
	  
	/*  List<Integer> lengths= new ArrayList<>();
	  
	  for(String vehicle :vehicles) {
		       lengths.add(vehicle.length());
	  }
	  
	  System.out.println(lengths); // [9, 3, 4, 5, 3] */
	  
	  // with streams
	  
	  List<Integer> lengths=vehicles.stream().map(s->s.length()).collect(Collectors.toList());
	  System.out.println(lengths); // [9, 3, 4, 5, 3]
}
}
