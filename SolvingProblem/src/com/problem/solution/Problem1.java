package com.problem.solution;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Problem1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		System.out.println(map);
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet)
		{
			 System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		map.putIfAbsent("One", 111);
		map.putIfAbsent("Six", 6);
		System.out.println(map);
		// int value = map.get("Six");
	//	System.out.println(value);
		// boolean b = map.containsKey("Five");
		// System.out.println(b);
	//	System.out.println(map.size());
	//	map.clear();
		

	}

}
