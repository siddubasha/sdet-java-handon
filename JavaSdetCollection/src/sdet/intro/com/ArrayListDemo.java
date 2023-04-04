package sdet.intro.com;

import java.util.*;

public class ArrayListDemo {
  public static void main(String[] args) {
	
	 // Declare ArrayList
	 // ArrayList al = new ArrayList();
	 //ArrayList al= new ArrayList<Integer>();
	 // ArrayList al= new ArrayList<String>();
	  
	  ArrayList al = new ArrayList();
	  
	  // add new element to array list
	  al.add("welcome");
	  al.add(5);
	  al.add('s');
	  al.add(true);
	  
	  System.out.println(al);  //[welcome, 5, s, true]
	  System.out.println(al.size()); //no of elements:4
	  
	  al.remove(0);
	  System.out.println(al); //[5, s, true]
	  
	  al.add(2,"siddu");
	  System.out.println(al); //[5, s, siddu, true]
	  
	  System.out.println(al.get(1)); ///s
	  
	  al.set(2, "basha");
	  System.out.println(al); //[5, s, basha, true]
	  
	  System.out.println(al.contains("basha")); //true
	  
	  System.out.println(al.isEmpty()); //false
	  
	  System.out.println("***********************************************");
	  // 1) for  loop iteration
	  for(int i=0;i<al.size();i++) {
		  System.out.println(al.get(i));
	  }
	  
	  // 2) for each loop
	  
	    for (Object object : al) {
			System.out.println(object);
		}
	    
	   // 3) iterator
	    System.out.println("************");
	    
	    Iterator it=al.iterator();
	    
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	  /* we should prefer array list if we have more retriving /search operations */
	    
	    
}
}
