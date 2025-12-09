package Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {1,54,67,88,2,66,45};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
			for(int k=0;k<a.length;k++) {
				System.out.println(a[k]);
			}
		
		
	}

}
