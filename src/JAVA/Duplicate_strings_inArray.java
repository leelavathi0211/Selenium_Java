package JAVA;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_strings_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"amazon","gcp","python","leela","azure","amazon","azure","gcp","leela","java"};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					System.out.println(a[i]);
				}
				
			}
		}
		System.out.println("USING SET");	
		Set<String> se=new HashSet<String>();
		for(String d:a) {
			if(se.add(d)==false) {
				System.out.println(d);
			}
		}
		
		
	}

}
