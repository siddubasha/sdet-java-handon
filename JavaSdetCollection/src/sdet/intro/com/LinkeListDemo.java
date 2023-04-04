package sdet.intro.com;

import java.util.Iterator;
import java.util.LinkedList;

/* we prefer linked list for insertion/Delete Operation*/
public class LinkeListDemo {
   
	public static void main(String[] args) {
		
		LinkedList l= new LinkedList<>();
		
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);  // [100, welcome, 15.5, A, true, null]
		
		System.out.println(l.size()); // 6
		
		//remove by index
		l.remove(3); 
		System.out.println(l);// [100, welcome, 15.5, true, null]
		
		//remove by object name
		l.remove("welcome");   
		System.out.println(l); // [100, 15.5, true, null]
		
		//insert by index
		l.add(2,"raju");
		System.out.println(l); //[100, 15.5, raju, true, null]
		
		// retriving object
		System.out.println(l.get(2)); //raju
		
		//change value
		l.set(2,"siddu");
		System.out.println(l); //[100, 15.5, siddu, true, null]
		
		// iterating through for each
		
		for (Object object : l) {
			System.out.println(object);
		}
		 System.out.println("******************************");
		 
		 Iterator it=l.iterator();
		 
		 while(it.hasNext()) {
			 System.out.println(it.next());
			 
		 }
		
		
	}
	
}
