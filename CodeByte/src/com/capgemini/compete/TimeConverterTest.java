package com.capgemini.compete;

import java.util.Scanner;

public class TimeConverterTest {

	public static String TimeConvert(int num) {

		int hour = num / 60;
		
		int minutes = num % 60;
		String format = String.valueOf(hour) + ":" + String.valueOf(minutes);
		
		return format;

	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.println("Enter a number to convert: ");
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());
		System.out.print(TimeConvert(num));
	}
}
