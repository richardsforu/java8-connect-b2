package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C1 {

	public static void main(String[] args) {

		Fruit f1 = new Fruit("Apple", 150, 5, 2000);
		Fruit f2 = new Fruit("Mongo", 50, 10, 3000);
		Fruit f3 = new Fruit("Banana", 250, 2, 1000);
		Fruit f4 = new Fruit("Apple", 150, 7, 5000);
		Fruit f5 = new Fruit("Mango", 50, 20, 7000);
		Fruit f6 = new Fruit("Banana", 250, 15, 6000);
		Fruit f7 = new Fruit("Apple", 150, 3, 800);
		
		
		List<Fruit> fruites=Arrays.asList(f1,f2,f3,f4,f5,f6,f7);
		System.out.println( "Original Data");
		Fruit.display(fruites);
		
		// Copy only apples into new collection...
		System.out.println("----------------------------------------------------");
		List<Fruit> apples= fruites.stream().filter(fruit->fruit.getName().equals("Apple")).collect(Collectors.toList());
		
		Fruit.display(apples);

		// Display Sum of Total Price of Apples
		
		double totalPrice = fruites.stream().filter(fruit->fruit.getName().equals("Apple")).mapToDouble(f->f.getPrice()*f.getQuantity()).sum();
		System.out.println("Apples Total: "+totalPrice);
		
		// Sort data by Fruit Name
		fruites.sort((o1,o2)->o1.getName().compareTo(o2.getName()));

		Fruit.display(fruites);
		
		fruites.sort((o1,o2)->o2.getName().compareTo(o1.getName()));
		
		System.out.println("Reverse order of Fruitt name");
		Fruit.display(fruites);
		
		fruites.sort((o1,o2)->((int)o1.getPrice()-(int)o2.getPrice()));
		Fruit.display(fruites);

		

		
		
		
		
		
		

	}

}
