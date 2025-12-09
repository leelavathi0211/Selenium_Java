package JAVA;

import java.util.HashMap;
import java.util.Map;

public class Countoccurance_foreveryword_string {

	public static void main(String[] args) {
		String s="Leelavathi Kakinada";
		s=s.toLowerCase();
		String []a=s.split(" ");
		
		for(String i:a) {
			Map<Character,Integer> m=new HashMap<>();
			for(char ch:i.toCharArray()) {
				Integer count=m.get(ch);
				if(count==null) {
					m.put(ch, 1);
				}
				else
					m.put(ch, count+1);
					
			}
		
		System.out.println(i);
		System.out.println(m);
		}
	}

}
