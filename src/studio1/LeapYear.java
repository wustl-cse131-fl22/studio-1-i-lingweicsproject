package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = in.nextInt();
		boolean condition1 = year % 4 == 0;
		boolean condition2 = year % 100 != 0;
		boolean condition3 = year % 400 == 0;
		boolean result = (condition1 && condition2) || condition3;
		System.out.print(year + " is a leap year: " + result +".");
	}

}
