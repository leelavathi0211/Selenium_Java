package Arrays;

public class Avg_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,4,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
			System.out.println(sum/a.length);
	}

}
