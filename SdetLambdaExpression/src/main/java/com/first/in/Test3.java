package com.first.in;
//type 3: lambda expression with taking arguments but  returning something
@FunctionalInterface
interface Caaab{
	
	String bookCab(String source,String destination);
}



public class Test3 {
   public static void main(String[] args) {
	
	   Caaab cab=(source,destination)->{System.out.println("Ola cab is booked from "+source+" To "+destination);
	   
	     return ("Price is:500/-");
	   };
	   
	   System.out.println(cab.bookCab("Hyderabad", "Bangalore"));
}
}
