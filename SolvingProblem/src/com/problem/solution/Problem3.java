package com.problem.solution;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Problem3 {

	
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 111);
		map.put(2, 222);
		map.put(3, 333);
		map.put(4, 444);
		map.put(5, 555);
		map.put(6, 666);
		System.out.println(map);
		
		Set<Entry<Integer, Integer>> keyvalueset = map.entrySet();
		for(Entry<Integer,Integer> entry: keyvalueset)
		{
			System.out.println(entry);
		}
		System.out.println("HashMap After Replace :  ");
		map.replace(3, 101);
		for(Entry<Integer,Integer> entry: keyvalueset)
		{
			System.out.println(entry);
		}
		
	}
}
