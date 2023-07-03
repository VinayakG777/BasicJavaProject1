package if_else;

import java.util.Scanner;

public class DivideChildIntoThreeGroups {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age=");
		int age=sc.nextInt();
		if(age<12)
		{
			System.out.println("child");
		}
		else if(12<age&&age<18)
		{
			System.out.println("Teenager");
		}
		else
		{
			System.out.println("adult");
		}
	}

}
