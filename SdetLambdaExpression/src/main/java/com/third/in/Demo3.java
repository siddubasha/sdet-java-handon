package com.third.in;

import java.util.function.Function;

/*
 To chain (join) function we have two methods:
 
 1. andThen()   f1 output is input to f2
 
 2. compose()   f2 output is input to f1
 
 
 */
public class Demo3 {
  public static void main(String[] args) {
	
	  Function<Integer, Integer> square=n->n*n;
	  Function<Integer, Integer> cube=n->n*n*n;
	  
	  System.out.println(square.andThen(cube).apply(2)); //64
	  
	  System.out.println(square.compose(cube).apply(2)); //64
}
}
