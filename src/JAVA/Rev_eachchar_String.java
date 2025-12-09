package JAVA;

public class Rev_eachchar_String {

	public static void main(String[] args) {
		String s="Leela vathi";
		String []a=s.split(" ");
		StringBuilder sb = new StringBuilder(); 
		for(String i:a) {
			String rev="";
			for(int j=i.length()-1;j>=0;j--) {
				rev=rev+i.charAt(j);
			}
			sb.append(rev).append(" ");
		}
		System.out.println(sb.toString());
	}

}
