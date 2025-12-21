package JAVA;
import java.util.*;

/*Remove duplicate words in array*/
public class Removeduplicatewordsfromarray {
	public static void main(String[] args) {
		String s[] = { "Java", "c", "Python", "Java", "Selenium", "Selenium" };
		/* Using loops--O[n*n] */

//		for (int i = 0; i < s.length; i++) {
//			for (int j = i + 1; j < s.length; j++) {
//				if (s[i].equals(s[j]))
//					System.out.println(s[i]);
//			}
//		}

		/* Using Hashmap */
		Set<String> se = new HashSet<>();
		for (String c : s) {
			if (se.add(c) == false) {
//				System.out.println(se);
			}

		}
		System.out.println(se);
	}
}
