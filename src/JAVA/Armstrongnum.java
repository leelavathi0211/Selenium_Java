package JAVA;

public class Armstrongnum {
	public static void isarmstrong(int num) {
		int sum=0;
		int tem;
		int rem;
		tem=num;
		while(num>0) {
			 rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);	
			System.out.println(sum);
		}
		if(tem==sum){
			System.out.println("Armstrng");
		}
		else {
			System.out.println("not Armstrng");
		}
	}

	
	/*FACTORIAL*/
//	public static void factorial(int n) {
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
//	}
//	public static int fact(int nu) {
//		if(nu==0) {
//			return 1;
//		}
//		else {
//		return (nu*fact(nu-1));
//		}
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isarmstrong(153);
//		factorial(3);
//		fact(5);
	}

}
