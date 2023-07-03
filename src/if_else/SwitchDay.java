package if_else;

import java.util.Scanner;

public class SwitchDay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day==");
		String day=sc.next();
		switch(day)
		{
		case "Monday":System.out.println("today is Workday"+day);
		break;
		case "Tuesday":System.out.println("today is Workday"+day);
		break;
		case "Wednesday":System.out.println("today is Workday"+day);
		break;
		case "Thursday":System.out.println("today is Workday"+day);
		break;
		case "Friday":System.out.println("today is Workday"+day);
		break;
		case "saturday":System.out.println("today is Workday"+day);
		break;
		case "sunday":System.out.println("today is HoliDay"+day);
		break;
		default :System.out.println("Enter correct spelling");
		}
	}

}
