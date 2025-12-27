package Arrays;

import java.util.HashMap;
import java.util.*;
public class Duplicates_from_array_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,2,4,5,1,2};
		Map<Integer,Integer> m=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			Integer count=m.get(a[i]);
			if(count==null) {
				m.put(a[i],1);
			}
			else
				m.put(a[i], count+1);
		}
		for(Integer j:m.keySet()) {
			if(m.get(j)>1) {
			System.out.println(j+"--"+m.get(j));
			}
		}
		
	}

}
