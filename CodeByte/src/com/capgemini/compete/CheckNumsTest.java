package com.capgemini.compete;

import java.util.Scanner;

public class CheckNumsTest {

	public static String CheckNums(int num1, int num2) {
		if (num2 > num1)
			return "true";
		else if (num1 > num2)
			return "false";
		else
			return "-1";
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		int num1 = Integer.parseInt(s.nextLine());
		int num2 = Integer.parseInt(s.nextLine());
		System.out.print(CheckNums(num1, num2));
	}

}
