package com.problem.solution;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Problem2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EEE");
		map.put(6, "GGG");
		System.out.println(map);
	
		
		// Retrieving all key value in map
		Set<Integer> keyset = map.keySet();
		
		for(Integer key:keyset)
		{
			System.out.println(key);
		}
		
		// Retrieving all value in map
		
		Collection<String> values = map.values();
		
		for(String value:values)
		{
			System.out.println(value);
		}
		
	}

}
