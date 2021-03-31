package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface Sum {
	int add(int x, int y);
	
	//void test();
}

public class C1 {

	/*
	 * 1.Mutable 2.Immutable
	 * 
	 */

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Abc", "Xyz", "Test", "AAA", "BBB"); // immutable
		// names.set(0, "James");
		// System.out.println(names);

		List<String> cities = new ArrayList<>(); // mutable
		cities.add("Chennai");
		cities.add("Hyderabad");

		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}

		System.out.println("-------------------------");

		for (String cityName : cities) {
			System.out.println(cityName);
		}

		System.out.println("---------------------------");

		Iterator<String> it = cities.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("LAMDAS::: ------------------------------");

		names.forEach(name -> { // recursive function
			System.out.println(name);
		});

		// System.out.println(cities);
		// names.add("Praveen");
		
		
		Sum s=new Sum() {
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		
		
		System.out.println("SUM: "+s.add(10, 20));
		
		
		Sum ss=(x,y)->{
			
			return x+y;
		};
		
		System.out.println(ss.add(100, 2000));
		
		Sum sss=(x,y)->x+y;
		System.out.println(sss.add(100,200));
		
		
		
		
		
		

	}

}
