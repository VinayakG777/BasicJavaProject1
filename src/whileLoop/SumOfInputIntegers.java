package whileLoop;

import java.util.Scanner;

public class SumOfInputIntegers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	int sum=0;
	while(num!=-1)
	{
		sum+=num;
		 num=sc.nextInt();
	}
	System.out.println("Addition is="+sum);
}
}
