package com.nonterminalandterminal.in;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
   public static void main(String[] args) {
	
	   List<String> vehicles=Arrays.asList("bus","bike","car","bus","cycle","bike");
	   
	   // get collection of unique objects  using distinct() non terminal
	   
	   List<String> distinctVehicles=vehicles.stream().distinct().collect(Collectors.toList());
	   
	   System.out.println(distinctVehicles); //bus, bike, car, cycle]
	   
	   
	   // get limited collection of objects using limit() non terminal method
	   
	   
	   List<String> limitedVehicles=vehicles.stream().limit(5).collect(Collectors.toList());
	   
	   System.out.println(limitedVehicles);  // [bus, bike, car, bus, cycle]
	   
	   
	   // get th e count of objecyts after getting distinct objects using count() terminal  method
	   
	   long countOfDistinctVehicles=vehicles.stream().distinct().count();
	   
	   System.out.println(countOfDistinctVehicles); //4

}
}
