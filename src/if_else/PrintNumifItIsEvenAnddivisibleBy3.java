package if_else;

import java.util.Scanner;

public class PrintNumifItIsEvenAnddivisibleBy3 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number=");
	int num=sc.nextInt();
	if(num%2==0&&num%3==0)
	{
		System.out.println(num+" is Correct");
	}
	else
	{System.out.println("Incorrect Number");
}
   }}
