package Arrays;

public class Binary_search {

	public static void main(String[] args) {
		int []a= {2,5,7,9,10};
		int left=0;
		int right=a.length-1;
		int target=9;
		while(left<=right) {
		int mid=(left+right)/2;
		
			if(a[mid]==target) {
				System.out.println(a[mid]);
				break;
			}
			else if (a[mid]>target) {
				right=mid-1;;
				System.out.println(a[mid]);
			
		}
			else {
				left=mid+1;
			System.out.println(a[mid]);
			}
		}
	}

}
