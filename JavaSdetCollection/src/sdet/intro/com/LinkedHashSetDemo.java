package sdet.intro.com;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
   public static void main(String[] args) {
	
	   LinkedHashSet ls= new LinkedHashSet<>();
	   ls.add(100);
	   ls.add(200);
	   ls.add(300);
	   ls.add(400);
	   
	   System.out.println(ls); //[100, 200, 300, 400]
}
}
