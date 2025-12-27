package JAVA;

public class Rearrange_string {

	public static void main(String[] args) {
		String s="aB#c@E1d!";
		StringBuilder vowels=new StringBuilder();
		StringBuilder con=new StringBuilder();
		StringBuilder spcl=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(Character.isLetter(c) && "AEIOUaeiou".indexOf(c)!=-1) {
				vowels.append(c);
			}
			else if(Character.isLetter(c)) {
				con.append(c);
			}
			else
				spcl.append(c);
		}
		
		System.out.println(vowels.toString()+spcl.toString()+con.toString());
	}

}
