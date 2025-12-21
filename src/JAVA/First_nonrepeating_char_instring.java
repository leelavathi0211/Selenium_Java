package JAVA;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_nonrepeating_char_instring {

	public static void main(String[] args) {
		String s="swiss";
		//LinkedHashMap--follow insertion order
		Map<Character,Integer> m=new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			Integer count=m.get(ch);
			if(count==null) {
				m.put(ch, 1);
			}
			else {
				m.put(ch, count+1);
			
		}
	}
		System.out.println(m);
		for(Character i:m.keySet()) {
		if(m.get(i)==1) {
		System.out.println(i);
		break;
		}
	}

	}
}
