package JAVA;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_chars_string {

	public static void main(String[] args) {
		String s="javtat";
		char []c=s.toCharArray();
		Set<Character> se=new HashSet<Character>();
		for(char i:c) {
			if(se.add(i)==false) {
				System.out.println(i);
			}
		}

	}

}
