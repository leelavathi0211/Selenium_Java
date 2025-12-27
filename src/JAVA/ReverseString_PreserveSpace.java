package JAVA;

public class ReverseString_PreserveSpace {

	public static void main(String[] args) {
		String s="I am a tester";
		char []c=s.toCharArray();
		int left=0;
		int right=c.length-1;
		while(left<right) {
			if(c[left]==' ') {
				left++;
			}
			else if(c[right]==' ') {
				right--;
			}
			else
			{
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;
				right--;
						}
		}
			System.out.println(new String(c));
	}

}
