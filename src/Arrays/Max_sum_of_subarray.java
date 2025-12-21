package Arrays;

public class Max_sum_of_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int cursum=a[0];
		int maxsum=a[0];
		for(int i=1;i<a.length;i++) {
			cursum=Math.max(a[i], cursum+a[i]);
			maxsum=Math.max(cursum, maxsum);
			
		}
		System.out.println(maxsum);
	}

}
