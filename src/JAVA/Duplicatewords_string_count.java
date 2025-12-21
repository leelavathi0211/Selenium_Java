package JAVA;

import java.util.HashMap;
import java.util.Map;

public class Duplicatewords_string_count {

	public static void main(String[] args) {
		String s= "Java is java because Java is powerful and java is popular";
		s=s.toLowerCase();
		/*To handle multiple spaces and tabs use regex
		*/
		String []words=s.split(" ");
		Map<String,Integer> m=new HashMap<>();
		for(String i:words) {
			Integer count=m.get(i);
			if(count==null) {
				m.put(i,1);
			}
			else {
				m.put(i, count+1);
			}
		}
		System.out.println(m);
		for(Map.Entry<String,Integer> entry:m.entrySet()) {
			if(entry.getValue()>1)
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
