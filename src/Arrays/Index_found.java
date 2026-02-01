package Arrays;
import java.util.*;
//import com.sun.tools.javac.p/arser.Scanner;

public class Index_found {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a= {1,3,3,4,5,6,6,7,8,9,9};
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				System.out.println(i);
				flag=true;
		
			}
			
		}
		if(flag==false) {
			System.out.println("Element not found");
		}

	}

}
