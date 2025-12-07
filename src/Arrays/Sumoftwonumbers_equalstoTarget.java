package Arrays;

public class Sumoftwonumbers_equalstoTarget {

	public static void main(String[] args) {
		int[] a= {7,8,11,6,7,18};
		int target=17;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int sum=a[i]+a[j];
				if(sum==target) {
					System.out.println(a[i]+"--"+i);
					System.out.println(a[j]+"--"+j);
				}
			}
		}
	}

}
