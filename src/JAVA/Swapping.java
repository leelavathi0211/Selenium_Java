package JAVA;


public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Leela";
		String t="Java is a java and java is not python";
		
		/*STRING MANIP*/		
		System.out.println(s.length());
//		System.out.println(s.trim());
		System.out.println(s.substring(4));
		System.out.println(s.trim());
		System.out.println(s.charAt(3));
		String arr[]=t.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String a="Hello";
		String b="wrorld";
		int c=100;
		int d=200;
		
		/*String concat*/
		System.out.println("concat");
		System.out.println(a+b+c+d);
		System.out.println(c+d+a+b);
		System.out.println(a+b+(c+d));
		System.out.println("Swapped");
		
		/*SWAPPING STRINGS--strip strings*/
		a=a+b;//Hello world
		b=a.substring(0,a.length()-b.length());//world
		a=a.substring(b.length());//if index is not specified it will take from end
		System.out.println(a);
		System.out.println(b);
		
	}

}
