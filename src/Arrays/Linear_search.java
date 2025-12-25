package Arrays;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		int []a= {1,4,5,8,3,8};
		int x=5;
		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
			if(a[i]==x) {
				System.out.println(i+"--ele--"+a[i]);
			}
		}
	}
}
