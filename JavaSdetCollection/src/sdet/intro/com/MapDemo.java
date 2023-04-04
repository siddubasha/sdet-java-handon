package sdet.intro.com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(101,"Jhon");
		hm.put(102,"David");
		hm.put(103,"Carl");
		hm.put(104,"Mary");
		
		System.out.println(hm); //{101=Jhon, 102=David, 103=Carl, 104=Mary}
		
		hm.put(101,"siddu");
		System.out.println(hm); //{101=siddu, 102=David, 103=Carl, 104=Mary}
		
		System.out.println(hm.get(102)); // David
		
		hm.remove(103);
		System.out.println(hm); //{101=siddu, 102=David, 104=Mary}
		
		System.out.println(hm.containsKey(101)); // True
		System.out.println(hm.containsKey(106)); // False
		
		System.out.println(hm.containsValue("Mary")); // true
		System.out.println(hm.containsValue("basha")); // false
		
	     System.out.println(hm.keySet()); //[101, 102, 104]
	     System.out.println(hm.values()); //[siddu, David, Mary]
	     
	     
	     for (Integer i :hm.keySet()) {
			System.out.println(i);
		}
	     for (String i :hm.values()) {
				System.out.println(i);
			}
	     for (Integer i :hm.keySet()) {
				System.out.println(i+" "+hm.get(i));
			}
	     System.out.println("*******************************");
	     for(Map.Entry<Integer,String> m:hm.entrySet()) {
	    	 System.out.println(m.getKey()+"  "+m.getValue());
	     }
			
		}
	}

