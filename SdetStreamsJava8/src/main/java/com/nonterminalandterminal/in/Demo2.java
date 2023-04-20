package com.nonterminalandterminal.in;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
  public static void main(String[] args) {
	  
	  
	  List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	  //  get the count of even numbers using count()
	  
	  Long countOfEvenNumbers=numbers.stream().filter(n->n%2==0).count();
	  
	  System.out.println(countOfEvenNumbers);
	  
	  // get the minmum number  using min()
	  
	 Optional<Integer> minNum=numbers.stream().min((n1,n2)-> { return n1.compareTo(n2);});
	 
	 System.out.println(minNum.get());
	  
	// get the maximum number  using max()
	  
	 Optional<Integer> maxNum=numbers.stream().max((n1,n2)-> { return n1.compareTo(n2);});
	 
	 System.out.println(maxNum.get());
}
}
