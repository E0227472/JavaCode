package com.capgemini.compete;

import java.util.Scanner;

public class Reverse {

	public static String FirstReverse(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return sb.toString();

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine()));
	}
}
