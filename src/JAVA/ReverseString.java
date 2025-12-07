package JAVA;
//Java programming
// Reverse string using loops and stringbuffer//
import java.util.*;

//Take input from keyboard and print entire string(group of strings) even with spaces and reverse it

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}

// Using String buffer class

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        StringBuffer sb = new StringBuffer(s);
//        System.out.println(sb.reverse());
//    }
//}
