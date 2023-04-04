package sdet.intro.com;

import java.util.HashSet;
import java.util.Iterator;
// hash set is prefered for searching operations.
public class HashSetDemo {
   public static void main(String[] args) {
	
	   HashSet hs= new HashSet<>();// default capacity is 16 and Load factor 0.75
	   
	 //  HashSet hs1= new HashSet<>(100); // intial capacity is 100
	   
	  // HashSet hs2= new HashSet<>(100, (float)0.90); // intial capacity is 100 and Load factor 0.90
	   
	   // add objects in to hashset object
	   
	   hs.add(100);
	   hs.add("welcome");
	   hs.add(16.4);
	   hs.add('A');
	   hs.add(true);
	   hs.add(null);
	   
	   
	   System.out.println(hs); // [null, A, 100, 16.4, welcome, true]
	   
	   //remove
	   hs.remove(16.4);
	   System.out.println(hs);  // [null, A, 100, welcome, true]
	   
	   //contains()
	   System.out.println(hs.contains(100)); // true
	   
	   System.out.println(hs.isEmpty()); //false
	   
	   // Reading objects /elements from hashset using for each
	   
	   for (Object object : hs) {
		System.out.println(object);
	}
	   System.out.println("*********************************");
	   Iterator it=hs.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	   

}
}
