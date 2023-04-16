package com.first.in;

public class Introduction1 {

	/*
	 The main objectives of  Lambda expression  in java :
	 
	 1. To achieve functional programming feature
	 2. To achieve  code optimization
	 
	 Lambda expression is an anonymous(name less) function.
	function Not having 1.Name 2.return type 3.Access modifier
	
	 This feature is supported from java  1.8
	 
	 ex:
	 public void square(int a){
	 return a*a;
	 }
	 
	 consized lambda expressions are:
	 
	 1.   (int a)->{ return a*a;};  ( no need of data type because compiler will detect at run time by context)
	 2.   (a)->a*a;  ( no need of return statement because it always return, if you use return need  curly braces must ).
	 3.   a->a*a;    ( if you  have only one argument no need of parenthesis () .
	 
	 Functional Interface:
	 
	 1.which is having only one abstract method in it is called Functional Interface or SAM.
	 2.but it can have any no of static and default methods.
	 ( from java 7  onwards interface also support static and default methods)
	 
	  examples of SAM in Java:
	  Runnable, Callable, Comparable, ActionListener
	  
	  
	 * we can invoke or write  lambda expression with functional interface only.
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
}
