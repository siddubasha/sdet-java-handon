package sdet.intro.com;

import java.util.HashSet;

public class HashSetDemo2 {
  public static void main(String[] args) {
	
	  //Union, Intersection,Difference
	  
	  HashSet set1= new HashSet<Integer>();
	  set1.add(1);
	  set1.add(2);
	  set1.add(3);
	  set1.add(4);
	  set1.add(5);
	  
	  System.out.println(set1); //[1, 2, 3, 4, 5]
	  
	  HashSet set2= new HashSet<Integer>();
	  
	  set2.add(3);
	  set2.add(4);
	  set2.add(5);
	  
	  System.out.println(set2); //[3, 4, 5]
	  
	  //union ---> unique elements
	 // set1.addAll(set2);
	 // System.out.println(set1); // [1, 2, 3, 4, 5]
	  
	  //Intersection----> common elements
	 // set1.retainAll(set2);
	 // System.out.println(set1);// [3, 4, 5]
	  
	  //difference ----> differet elements
	  //set1.removeAll(set2);
	  //System.out.println(set1);//[1, 2]
	  
	  
	  
	  
}
}
