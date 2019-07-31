package com.capgemini.compete;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LongestWord {

	public static String LongestWord(String sen) {

		String word = "";
		List<String> words = new LinkedList<String>();

		for (int i = 0; i < sen.length(); i++) {
			if (Character.isLetterOrDigit(sen.charAt(i))) {
				word += String.valueOf(sen.charAt(i));
			} else {
				words.add(word);
				word = "";
			}
		}
		
		if(word != "")
			words.add(word);
		int maxlength = 0;
		String result = null;

//		for (String wordEle : words) {
//			System.out.println(wordEle);
//		}

		for (String wordEle : words) {
			if (wordEle.length() > maxlength) {
				maxlength = wordEle.length();
				result = wordEle;
			}
		}

		sen = result;
		return sen;

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String to test: ");
		System.out.print(LongestWord(s.nextLine()));
	}

}
