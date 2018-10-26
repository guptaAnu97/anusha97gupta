package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, Object> cities = new HashMap<>();

		cities.put(10, "Hyderabad");
		cities.put(13, "Pune");
		cities.put(12, "Bangalore");
		cities.put(11, "Mangalore");
		cities.put(14, "North Goa");
		cities.put(12, "Kolkata");
		cities.put(18, "Pune");
		Set<Integer> keys = cities.keySet();
		for(Integer key :keys)
			System.out.println(key);
		System.out.println("-------------------");
		Set<Map.Entry<Integer,Object>> obj= cities.entrySet();
		for(Object obj1:obj)
			System.out.println(obj1);
		System.out.println("-------------------");

		System.out.println(cities);

	}

}