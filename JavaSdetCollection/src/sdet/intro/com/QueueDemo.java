package sdet.intro.com;

import java.util.PriorityQueue;
import java.util.*;

/*Queue follows FIFO
 * Queue interface is implemented by ProrityQueue(C) and LinkedList(C)
 * 
 * PQ can allow Homogenous but follows insertion order and Duplicates are allowed
 * 
 * Methods in Queue(I)
 * 
 * 1.add()  --> if object added sucessfully returns true otherwise returns Exception.
 * 2.Offer()--> if object added sucessfully returns true otherwise returns False.
 * 3.element()--> It is used to get Head Object(ready to process or first in queue), if no elements in queue returns Exception.
 * 4.peek()--> It is used to get Head Object(ready to process or first in queue), if no elements in queue returns null.
 * 5.remove()-->It is used to get Head Object(ready to process or first in queue)and remove, if no elements in queue returns Exception.
 * 6.poll()-->It is used to get Head Object(ready to process or first in queue)and remove, if no elements in queue returns null.
 */
public class QueueDemo {
 public static void main(String[] args) {
	
	 PriorityQueue pq=new PriorityQueue();
	 
	 //Adding elements
	 
	 pq.add("A");
	 pq.add("B");
	 pq.add("C");
	 pq.add("D");
	 pq.add("D");
	 System.out.println(pq); //[A, B, C, D, D]
	 
	 System.out.println(pq.element()); //A
	 
	 System.out.println(pq.peek()); //A
	 
	 pq.remove();
	 System.out.println(pq); //
	 TreeSet t;
	 
	 
	 
	 
}
}
