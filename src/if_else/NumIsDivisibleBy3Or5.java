package if_else;

import java.util.Scanner;

public class NumIsDivisibleBy3Or5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number==");
	int num=sc.nextInt();
	if(num%3==0||num%5==0)
	{
		System.out.println("correct number");
	}
	else
	{
		System.out.println("Incorrect number");
	}
}
}
