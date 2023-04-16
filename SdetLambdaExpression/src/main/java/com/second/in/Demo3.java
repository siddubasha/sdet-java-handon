package com.second.in;

import java.util.function.Predicate;

// Joining of Predicates and, or, no , negate
/*   p1   p2
 *   T    T     T     AND
 *   T    F     T     OR
 
      p1---> check number is even
      p2---> check greater than 50
 */

public class Demo3 {
   public static void main(String[] args) {
	
	   int a[]= {5,10,15,20,25,30,35,40,45,50,55,60,65,70};
	   
	   Predicate<Integer> p1=i->i%2==0;
	   Predicate<Integer> p2=i->i>50;
	   
	   
	   // AND 
	   System.out.println("following numbers are even and greater than 50");
	   for(int n:a) {
		  // if(p1.test(n)&&p2.test(n))   // logical operator
		   if(p1.and(p2).test(n))         // and operator
		   {
			   System.out.println(n);
		   }
	   }
	   
	   // OR
	   System.out.println("following numbers are even or greater than 50");
	   for(int n:a) {
		   if(p1.or(p2).test(n))         // and operator
		   {
			   System.out.println(n);
		   }
	   }
	// Negation
	   System.out.println("following numbers odd numbers");
	   for(int n:a) {
		   if(p1.negate().test(n))         // and operator
		   {
			   System.out.println(n);
		   }
	   }
	   
}
}
