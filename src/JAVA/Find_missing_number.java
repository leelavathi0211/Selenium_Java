package JAVA;
import java.util.*;

/*MISSING NUMBER IN ARRAY SEQUESNCE*/
public class Find_missing_number{
	public static void main(String[] args) {
		int a[]={1,2,3,4,6};
		int length=a.length;
		int max=a[length-1];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++){
		    sum1=sum1+a[i];
		}
	    for(int j=1;j<=max;j++){
	        sum2=sum2+a[j];
	    }
	    System.out.println(sum2-sum1);
	}
}
