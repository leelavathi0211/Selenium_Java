package JAVA;

import java.util.HashMap;
import java.util.Map;

public class CountOfOccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Leela vathi";
		String f=s.toLowerCase();
		f=f.replaceAll(" ", "");
		Map<Character,Integer> m=new HashMap<>();
//		for(char c:f.toCharArray()) {
//			m.put(c, m.getOrDefault(c,0)+1);
//			}
		for (char ch : f.toCharArray()) {
		    Integer count = m.get(ch);       // may be null if first time
		    if (count == null) {
		        m.put(ch, 1);
		    } else {
		        m.put(ch, count + 1);
		    }
		}
		
		System.out.println(m);
	}

}
