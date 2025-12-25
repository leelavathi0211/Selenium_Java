package Arrays;

import java.util.HashSet;

public class Common_elements_twoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,4,6,7,4,5,2};
		int []b= {2,5,9,3,7,5,8};
		HashSet<Integer> s=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		for(int j:b) {
			if(s.contains(j)){
				System.out.println(j);
			}
		}
	}

}
