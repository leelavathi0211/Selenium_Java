package JAVA;

public class Palindrome_string {

	public static void main(String[] args) {
		String s="madam";
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
		}
		if(s.equals(temp)){
			System.out.println("P");
		}
		else
			System.out.println("NP");
	}

}
