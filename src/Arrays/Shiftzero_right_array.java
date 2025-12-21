package Arrays;

public class Shiftzero_right_array {

	public static int[] shiftzero(int[] x) {
		int []b =new int[x.length];
		int count=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]!=0) {
				b[count]=x[i];
				count++;
				
			}
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,0,4,0,7,0};
		System.out.println(shiftzero(a));
	}

}
