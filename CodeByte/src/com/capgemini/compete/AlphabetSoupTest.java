package com.capgemini.compete;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSoupTest {

	public static String AlphabetSoup(String str) {

		char strChars [] = str.toCharArray();
		Arrays.sort(strChars);
		

		return String.valueOf(strChars);

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(AlphabetSoup(s.nextLine()));
	}

}
