package JAVA;
import java.util.*;

/* To remove special chars from string using Regular Expression add ^(not) for the not replaceable chars
[not of all]*/
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String st = s.replaceAll("[^0-9A-Za-z]", "");
//		System.out.println(st);
//
//	}
//}

/* REVERSE NUMBER */
public class Removespecialchar_REVnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/* Using loops */
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		/* Using stringbuffer */
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
	}
}
