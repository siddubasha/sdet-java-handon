package com.map.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
  public static void main(String[] args) {
	
	  List<String> vehicles =Arrays.asList("aeroplane","car","bike","cycle","car");
	  
	  // conver vehicles list into upper case
	  
	  // without streams
	  
	/*  List<String> upperCaseVehicles=new ArrayList<>();
	  
	  for(String vehicle :vehicles) {
		  upperCaseVehicles.add(vehicle.toUpperCase());
	  }
	  System.out.println(upperCaseVehicles); // [AEROPLANE, CAR, BIKE, CYCLE, CAR] */
	  
	  // with streams
	  
	 List<String> upperCaseVehicles= vehicles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
	 System.out.println(upperCaseVehicles); // [AEROPLANE, CAR, BIKE, CYCLE, CAR]
}
}
