package Arrays;

public class Check_substring {

	public static boolean substring(String s,String sub) {
		return s.matches("(.*)"+sub+"(.*)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(substring("leela","eel"));
		System.out.print(substring("leela","va"));
		
	}

}
