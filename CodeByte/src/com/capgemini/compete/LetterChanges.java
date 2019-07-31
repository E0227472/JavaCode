package com.capgemini.compete;

import java.util.Arrays;
import java.util.Scanner;

public class LetterChanges {

	public static String LetterChanges(String str) {

		char[] strChars = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (Character.isLetter(strChars[i])) {
				int unicode =  strChars[i];
				unicode++;
				strChars[i] = (char) unicode;
				
				
				if (strChars[i] == 'a' || strChars[i] == 'e' || strChars[i] == 'i' || 
						strChars[i] == 'o' || strChars[i] == 'u') {
					strChars[i] = Character.toUpperCase(strChars[i]);
				}
			}
		}

		return String.valueOf(strChars);

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(LetterChanges(s.nextLine()));
	}

}
