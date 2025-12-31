package Arrays;
import java.util.*;
public class Mergelists_remove_duplicates {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("A","B","C");
		List<String> l2=Arrays.asList("B", "C", "D");
		Set<String> merged=new HashSet<>();
		merged.addAll(l1);
		merged.addAll(l2);
		System.out.println(merged);
	}

}
