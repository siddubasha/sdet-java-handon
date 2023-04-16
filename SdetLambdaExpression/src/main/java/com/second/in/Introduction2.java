package com.second.in;


public class Introduction2 {
  /*
   before java 8 , we need to define our own Functional interface to deal with lambda expression.
   but after java 8 , there are some predefined functional interfaces we can use for lambda expression.
   They are
   1. Predicate
   2. Function
   3. Consumer
   4. Supplier
   ( java.util.function package )
    
    Predicate<T>: It is having single abstract method(name is Test) , which take one argument return boolean value.
               use only if you have  conditional checks in program
    Function<T,R>: It is having single abstract method(name is apply) , which take one argument return a single value.
    
    Consumer<T>: It is having single abstract method(name is accept),it will take single parameter , but not return anything( it just consumes input) 
    
    Supplier<R>: It is having single abstract method(name is get),it will not take any parameter , but  return one type( it just supplies output) 
              
    */
}
