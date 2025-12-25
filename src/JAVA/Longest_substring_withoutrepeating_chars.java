package JAVA;

import java.util.HashMap;
import java.util.Map;

public class Longest_substring_withoutrepeating_chars {

	public static void main(String[] args) {
		String s="abcdabcaad";
		int start=0;
		int maxlength=0;
		Map<Character,Integer> m=new HashMap<>();
		for(int end=0;end<s.length();end++) {
			char ch=s.charAt(end);
			if(m.containsKey(ch)) {
				start=Math.max(start,m.get(ch)+1);
			}
			
			m.put(ch, end);
			maxlength=Math.max(maxlength, end-start+1);
		
		}
		System.out.print(maxlength);
	}

}
