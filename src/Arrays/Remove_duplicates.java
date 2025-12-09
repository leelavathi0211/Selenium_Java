package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Remove_duplicates {

	public static void main(String[] args) {
		int []a= {1,3,4,1,6,78,6,3};
		/*USING MAP
		Map<Integer,Integer> m=new HashMap<>();
		for(Integer i:a) {
			Integer count=m.get(i);
				if(count==null) {
				m.put(i, 1);
			}
				else
					m.put(i,count+1);
		}
		for(Integer j:m.keySet()) {
			if(m.get(j)>=2) {
		System.out.println(j+" "+m.get(j));
			}
	}*/
		/*Remove duplicates and print frequencies*/
		Set<Integer> s=new HashSet<>();
		Set<Integer> dup=new HashSet<>();
		Arrays.sort(a);
		for(int i:a) {
			if(!s.add(i)) {
				dup.add(i);
			}
		}
		System.out.println(s);

	}

}
