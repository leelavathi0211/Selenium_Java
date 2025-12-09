package Arrays;
//import java.util.*;
/*MAX AND MIN IN ARRAY*/
public class MINMAX_ARRAY_swapping
{
	public static void main(String[] args) {
		int[] a={1,2,4,6,9,8};
		/*USING LOOPS*/
		
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++){
 		    if(a[i]>max){
		        max=a[i];
		    }
		     if(a[i]<min){
		        min=a[i];
		    }
}
		System.out.println(min);
		System.out.println(max);

		/*USING BUILTIN KW*/
		
		
		int maxx=Integer.MAX_VALUE;
		int minn=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
		    if(a[i]<maxx){
		        maxx=a[i];
		    }
		     if(a[i]>minn){
		        minn=a[i];
		    }
		}
		System.out.println(minn);
		System.out.println(maxx);
		
		/*SWAPPING*/
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		a=a*b;
//		b=a/b;
//		a=a/b;
	}
}
