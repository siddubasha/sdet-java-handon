package sdet.intro.com;

import java.util.Collection;

/*
   * Collection means Group of Objects ,(Collection of animals means group of animals, Collection of employees means group of employees)
   * 
   * Collection is a single entity which represents multiple objects.
   * 
   * Collection framework provides or defines different interfaces and classes to represent group of objects as collection.
   * 
   * ---------Need of Collection Framework---------------------
   * 
   * a variable can store only one data only.
   * int a=10;
   * 
   * by using array data structure we can store multiple data . But it can store only homogeneous data type.
   * int a[]= new int[10];
   * 
   * by using Object type and array data structure we can store multiple data type but not custom data  type .
   * Object ob[]= new Object[30];
   * 
   * But, Here 
   * 1. size is fixed(Not growable in nature)
   * 2. It can store Homogeneous 
   * 3.It will not use any data structure, so  it can not support any ready made methods.
   * 
   * so we need Collection framework.
   * 
   *  Collection(I) --> common methods are present in it, we can use them commonly among all collection classes.
   *  Collections(C)-->It is a class from java.utils package. It also contain certain methods  we can use those methods 
   *  along with collection objects.
   *  
   *  
   *  Collection(I)
   *  1.List(I) 2.Set(I)  3. Queue(I)
   *  
   *  List(I)
   *  ----------
   *  List is a child interface of collection(I)
   *  Insertion order is preserved & Duplicates also allowed
   *  
   *  1.ArrayList(C) 2.LinkedList(C) 3.Vector(C) -> Stack(C)
   *  
   *  
   *  Set(I)
   *  ---------
   *  set is child interface of Collection(I)
   *  Insertion  order not preserved & Duplicates not allowed
   *  
   *  1.HashSet(C) 2.LinkedHashSet(C) 3.TreeSet(C)
   *  
   *  Queue(I)
   *  ---------
   *  It is used when we represent group of objects which are prior to processing.
   *  
   *  1.PriorityQueue(C)
   *  
   *  
   *  
   *  Map(I)
   *  we can represent a group of objects as a single entity in the form of key&value pair.
   *  
   *  1.HashMap(C) 2.LinkedHashMap(C) 3.TreeMap(C) 4.HashTable(C)
   * */
public class Start{
	public static void main(String[] args) {
		/* methods available in Collection(I)
		 * add(Object o)
		 * addAll(Collection c)
		 * remove(Object o)
		 * removeAll(Collection c)
		 * retainALL(Collection C)
		 */
		
		Collection s;
	}
}
