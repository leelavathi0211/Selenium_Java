package JAVA;

import java.util.HashMap;
import java.util.Map;

public class Occurance_Words_senetence_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java is a java because it is java";
		s=s.toLowerCase();
		/*To handle multiple spaces and tabs use regex
		String []words=s.split("\\s+");
		to replace all the special chars
		s = s.replaceAll("[^a-z]", "");
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
	}
}
