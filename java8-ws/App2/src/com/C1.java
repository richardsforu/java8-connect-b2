package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class C1 {

	List<String> cities;

	public String findCity(String cityName) {
		
		  for(String cn:cities) {
			  if(cn.equals(cityName)) {
				  return cn;
			  }
		  }
		
		return null;
	}
	
	public Optional<Object> findCityV1(String cityName) {
		
		 for(String cn:cities) {
			  if(cn.equals(cityName)) {
				  return Optional.ofNullable(cn);
			  }
		  }
		return null;
	}

	public C1() {
		cities = new ArrayList<>();
		cities.add("Hyderabad");
		cities.add("Goa");
		cities.add("Chennai");
		cities.add("Kolkata");
		cities.add("Pune");
	}
	
	
	public static void main(String[] args) {
		C1 c1=new C1();
		System.out.println(c1.cities);
		
		
		//String s1= c1.findCity("Goaa");
		
		Object s1= c1.findCityV1("Goaa").orElseThrow(null);
		
		
		System.out.println(s1);
		
		
		
		
		
		
	}

}
