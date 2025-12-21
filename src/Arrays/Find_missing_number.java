package Arrays;
import java.util.*;

/*MISSING NUMBER IN ARRAY SEQUESNCE*/
public class Find_missing_number{
	public static void main(String[] args) {
		int a[]={1,2,3,4,6};
		int length=a.length;
		int max=a[length-1];
		System.out.println(max);
		int s=0;
		int res=0;
		int sum=(max*(max+1))/2;
		for(int i=0;i<a.length;i++) {
			 res=res+a[i];
		}
		s=sum-res;
		System.out.println(s);
		//alternative
//		int sum1=0;
//		int sum2=0;

//		for(int i=0;i<a.length;i++){
//		    sum1=sum1+a[i];
//		}
//	    for(int j=0;j<=max;j++){
//	        sum2=sum2+a[j];
//	    }
//	    System.out.println(sum2-sum1);
	}
}
