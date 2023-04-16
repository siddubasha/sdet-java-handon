package com.third.in;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
    	
    	
    	//EX1: get square of an integer, function interface taking two two types as argument one is input type , second is output type
		Function<Integer, Integer> f=n->n*n;
		
		System.out.println(f.apply(5)); // 25
		System.out.println(f.apply(10)); // 100
		
		
		//EX2: take string as input and return length of string
		Function<String, Integer> f1=s->s.length(); 
		System.out.println(f1.apply("siddu"));  //5
	}
}
