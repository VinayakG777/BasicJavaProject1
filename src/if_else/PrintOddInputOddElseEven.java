package if_else;

import java.util.Scanner;

public class PrintOddInputOddElseEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		int num=sc.nextInt();
		/*
		 * if(num%2!=0) { System.out.println("Num is Odd=="+num); } else {
		 * System.out.println("Num is Even="+num); }
		 */
		 String ans=(num%2==0)?"even":"odd";
		 System.out.println(ans);
	}

}
