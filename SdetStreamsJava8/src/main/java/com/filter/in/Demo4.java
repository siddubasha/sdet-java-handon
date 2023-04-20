package com.filter.in;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Product{
	
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}


public class Demo4 {
  public static void main(String[] args) {
	
	  List<Product> products=Arrays.asList(
			  new Product(1,"HP laptop", 25000),
			  new Product(2, "Dell laptop", 30000),
			  new Product(3, "Lenova laptop", 28000),
			  new Product(4, "Sony laptop", 23000),
			  new Product(5, "Apple laptop  ",90000)
			  );
	  
	  // filter product price is > 25000
	  
	List<Product> highPriceProducts= products.stream().filter(p->p.price>25000).collect(Collectors.toList());
	
	for (Product product : highPriceProducts) {
		System.out.println(product);
	}
}
}
