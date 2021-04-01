package com;

import java.util.List;

public class Fruit {

	private String name;
	private int calaries;
	private int quantity;
	private double price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Fruit(String name, int calaries, int quantity, double price) {
		super();
		this.name = name;
		this.calaries = calaries;
		this.quantity = quantity;
		this.price = price;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalaries() {
		return calaries;
	}

	public void setCalaries(int calaries) {
		this.calaries = calaries;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void display(List<Fruit> frites) {
		
		System.out.println("Name\tCalaries\tQuantity\tPrice");
		System.out.println("------------------------------------------------------------");
		for(Fruit fruit:frites) {
			System.out.print(fruit.getName()+"\t"+fruit.getCalaries()+"\t\t"+fruit.getQuantity()+"\t\t"+fruit.getPrice());
			System.out.println();
		}
	}

}
