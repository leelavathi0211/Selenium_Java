package JAVA;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_concept {

	public static void main(String[] args) {
		//HM is a class that implements map interface
		//stores only unique values in the form of key value pairs--unordered
		//it may have one null key and multiple null values....Even though there is no element with that key it return null without any error 
		//HM not synchronized-not thread safe
		//If the key already present then it wont add again instead replaces the value of that key with new value--PUT
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"Leela");
		m.put(2, "Sai");
		m.put(3,"Java");
		//To access each value with key
		System.out.println(m.get(3));
		//To get entire set of keys 
		System.out.println(m.keySet());
		//To retrieve all the values in the map
		System.out.println(m.values());
		//Slightly slower because map.get(key) is called each time-->>Good when keys-only processing is required.
		System.out.println("Using SET");
		for(Integer key:m.keySet()) {
			System.out.println(key+" "+m.get(key));
		}
		
		//Using ENTRYSEY(K+V)--Fastest and Direct access to key + value
		System.out.println("EntrySet");
		for(Map.Entry<Integer, String> entry:m.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
