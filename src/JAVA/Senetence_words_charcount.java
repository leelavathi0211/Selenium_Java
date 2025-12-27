package JAVA;

public class Senetence_words_charcount {

	public static void main(String[] args) {
		String x="leela loves java as java do not like any one";
		String []s=x.split(" ");
		for(String z:s) {
			System.out.println(z+"--"+z.length());
		}
		
		/*     OR
		for(int i=0;i<s.length;i++) {	
//			char[] c=s[i].toCharArray();
//			System.out.println(s[i]+"-"+c.length);
		}*/

	}

}
