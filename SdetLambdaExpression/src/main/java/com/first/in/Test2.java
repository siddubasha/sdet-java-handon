package com.first.in;
//type 2: lambda expression with taking arguments but not returning anything
@FunctionalInterface
interface Caab{
	void bookCab(String source,String destination);
}



public class Test2 {
  public static void main(String[] args) {
	Caab cab=(source,destination)->System.out.println("Ola cab is booked from "+source+" To "+destination);
	
	cab.bookCab("Hyd", "ndyl");
}
}
