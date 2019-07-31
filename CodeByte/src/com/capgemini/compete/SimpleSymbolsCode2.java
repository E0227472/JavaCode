package com.capgemini.compete;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleSymbolsCode2 {

	public static String SimpleSymbols(String str) {
		String result = null;
		int countPattern = 0;
		int countLetter = 0;

		String pattern = "([+]+[a-z] + [+])";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);

		while (m.find())
			countPattern++;

		String letter = "[a-z]";
		Pattern r1 = Pattern.compile(letter);
		Matcher m1 = r1.matcher(str);

		while (m1.find())
			countLetter++;

		return String.valueOf(countLetter == countPattern);

	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.println("Enter a string value: ");
		Scanner s = new Scanner(System.in);
		System.out.print(SimpleSymbols(s.nextLine()));
	}

}
