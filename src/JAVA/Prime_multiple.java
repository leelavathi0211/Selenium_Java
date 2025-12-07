package JAVA;

public class Prime_multiple {
/*To check if number is prime or not    &&&&     print prime numbers in given range*/
	public static boolean isprime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void primenums(int range) {
		for(int i=2;i<=range;i++) {
			if(isprime(i))
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println(isprime(8));
		primenums(19);

	}

}
