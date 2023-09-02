package Java8Feature;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
public static void main(String[] args) {
	List<Product> productList=new ArrayList<>();
	
	productList.add(new Product(1,"HP",25000f));
	productList.add(new Product(2,"DELL",40000f));
	productList.add(new Product(3,"LENOVA",28000f));
	productList.add(new Product(4,"SONY",50000f));
	productList.add(new Product(5,"APPLE",80000f));
	
	System.out.println(productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList()));
	System.out.println(productList.stream().filter(p->p.price>30000).map(p->p.price).toList());
	System.out.println(productList.stream().filter(p->p.price<30000).count());
	
	productList.stream().filter(p->p.price==28000).forEach(p->System.out.println(p.name));
	
	float totalPrice=productList.stream().map(p->p.price).reduce(0.0f,Float::sum);
	System.out.println("Total price="+totalPrice);
	
	System.out.println(productList.stream().collect(Collectors.summingDouble(p->p.price)));
	
//	float sum=productList.stream().reduce(p1,p2)->(p1+p2);
	Product maxprice=productList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
	System.out.println("Maximum price: "+maxprice.price);
	
	Product minprice=productList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
	System.out.println("Minimum price: "+minprice.price);
	
}
}