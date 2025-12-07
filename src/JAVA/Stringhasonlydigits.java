package JAVA;

public class Stringhasonlydigits {
	public static boolean stringdigits(CharSequence cs) {
		
		int len=cs.length();
		for(int i=0;i<len;i++) {
			if(!Character.isDigit(cs.charAt(i))){
				return false;

			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringdigits("86289hjnk");
	}

}
