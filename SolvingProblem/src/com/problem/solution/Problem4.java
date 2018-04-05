package com.problem.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


@SuppressWarnings("unused")
public class Problem4 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Aman");
		map.put(2, "Ankit");
		map.put(3, "Ajay");
		map.put(4, "Akash");
		map.put(5, "Ankur");
		map.put(6, "Ashish");
		System.out.println(map);
		
		Set<Integer> keyset = map.keySet();
		ArrayList<Integer> lkey = new ArrayList<>(keyset);
		 System.out.println("ArrayList Of Keys :");
         
	        for (Integer key : lkey) 
	        {
	            System.out.println(key);
	        }
	        System.out.println("--------------------------");
	         
	        
			Collection<String> values = (Collection<String>) map.values();
			ArrayList<String> listOfValues = new ArrayList<String>(values);
		         
		        System.out.println("ArrayList Of Values :");
		         
		        for (String value : listOfValues) 
		        {
		            System.out.println(value);
		        }
		        
		        Set<Entry<Integer, String>> entrySet = map.entrySet();
		         
		        //Creating an ArrayList Of Entry objects
		         
		        ArrayList<Entry<Integer, String>> listOfEntry = new ArrayList<Entry<Integer,String>>(entrySet);
		         
		        System.out.println("ArrayList of Key-Values :");
		         
		        for (Entry<Integer, String> entry : listOfEntry) 
		        {
		            System.out.println(entry.getKey()+" : "+entry.getValue());
		        }
	}
	
}
