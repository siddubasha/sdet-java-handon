package com.morenonterminalandterminal.in;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
  
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,4,1,3,7,5,9);
		
		// sort above list using sorted()
		
		List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList); // [1, 2, 3, 4, 5, 7, 9]
		
		// reverse sort list using sorted()
		
		List<Integer> reversesortedList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reversesortedList); // [9, 7, 5, 4, 3, 2, 1]
				
	}
}
