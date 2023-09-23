package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo 
{

	public static void main(String[] args) 
	{
		List<Product> list=new ArrayList<Product>();
//		for(Product p:getProduct())
//		{
//			if(p.getPrice()>23.0f)
//			{
//				list.add(p);
//			}
//		}
//		for(Product p:list)
//		{
//			System.out.println(p);
//		}
		
//		by using stream
		List<Product>list2=getProduct().stream().filter(product->product.getPrice()>23.0f).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
	}
    private static List<Product> getProduct()
    {
    	List<Product> productlist=new ArrayList<Product>();
    	productlist.add(new Product(1,"abc",23.6f));
    	productlist.add(new Product(2,"abcd",25.6f));
    	productlist.add(new Product(3,"abcdef",28.6f));
    	productlist.add(new Product(4,"abcedr",20.6f));
    	productlist.add(new Product(5,"abcas",22.6f));
    	return productlist;
    }
}
class Product
{
	private int id;
	private String name;
	private  float price;
	
	public Product(int id, String name, float price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}