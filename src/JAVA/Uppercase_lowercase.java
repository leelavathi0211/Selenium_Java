package JAVA;

public class Uppercase_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="TATA Consultancy services";
//		char[] a=s.toCharArray();
		String res="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
			
				res = res + Character.toLowerCase(c);
			}
			else {
				res=res+Character.toUpperCase(c);
		}
		}
		System.out.println(res);
	}

}
