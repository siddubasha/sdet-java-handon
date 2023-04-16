package com.first.in;
// type 1: lambda expression without taking arguments
@FunctionalInterface
interface Cab{
	void bookCab();
}

/*class Ola implements Cab{

	public void bookCab() {
        System.out.println("ola cab is booked");		
	}
	
}*/


public class Test {
   public static void main(String[] args) {
	
	  // Ola cab= new Ola();
	  // Cab cab= new Ola();
	   Cab cab=()->System.out.println("ola is booked");
	   cab.bookCab();
}
}
