package Arrays;

public class Cumulative_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6};
		int []b=new int[a.length];
		b[0]=a[0];
		for(int i=1;i<a.length;i++) {
			b[i]=b[i-1]+a[i];
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}

}
