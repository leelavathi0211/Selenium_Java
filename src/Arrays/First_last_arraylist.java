package Arrays;

import java.util.ArrayList;



public class First_last_arraylist {

	public static void main(String[] args) {
		ArrayList<String> l =new ArrayList<>();
		l.add("Leela");
		l.add("Infosys");
		l.add("Cotiviti");
		l.add("MUVI");
		l.add("Deloitte");
		System.out.println(l.get(0));
		System.out.println(l.get(l.size()-1));

	}

}
