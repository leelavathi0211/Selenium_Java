package JAVA;

import java.util.HashMap;
import java.util.Map;

public class Anagrams_Hashmap {

	public static void main(String[] args) {
		/*“I remove spaces, convert to lower case, and check the lengths.
Then I count characters of the first string using a HashMap.
Next, I decrement the counts using the second string.
If all final counts are zero, the strings are anagrams.”*/
		String s1="leela";
		String s2="eelaL";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("NA");
			return;
		}
		Map<Character,Integer> m=new HashMap<>();
		for(char c:s1.toCharArray()) {
			Integer count=m.get(c);
			if(count==null) {
				m.put(c, 1);
			}
			else
				m.put(c, count+1);
		}
		for(char c:s2.toCharArray()) {
			if(!m.containsKey(c)) {
				System.out.println("NA");
				return;
			}
			m.put(c, m.get(c)-1);
		}
		for(Integer v:m.values()) {
			if(v!=null) {
				System.out.println("NA");
				return;
			}
		}
		System.out.println("A");
	}

}
