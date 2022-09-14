package ua.ithillel.java.controller;

import java.util.Locale;

public class StringUtils {
	
	public static int findSymbolOccurance(String str, char sym) {
		if (str == null) {
			System.out.print("Data entered incorrectly. ");
			return -1;
		}
		int symbol = 0;
		for (char ch : str.toCharArray()) {
			if (ch == sym) {
				symbol++;
			}
		}
		System.out.println("In the text " + symbol + " symbols - " + sym);
		return symbol;
	}
	
	public static int findWordPosition(String source, String target) {
		if (source == null || target == null) {
			System.out.print("Data entered incorrectly. ");
			return -1;
		} else {
			char nextLine = '\n';
			source.contains(target);
			int index = source.indexOf(target);
			System.out.println("Source: " + source + nextLine + "Target: " + target + nextLine
					+ "Result: " + index);
			return index;
		}
	}
	
	public static String stringReverse(String str) {
		String incorrect = "Data entered incorrectly. ";
		if (str == null) {
			System.out.print(incorrect);
			return incorrect;
		}
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(str + " -> " + rev);
		return rev;
	}
	
	public static boolean isPalindrome(String str) {
		if (str == null) {
			System.out.print("Data entered incorrectly. ");
			return false;
		}
		if (str.equals(stringReverse(str))) {
			System.out.println(str + " -> " + "true");
			return true;
		} else {
			System.out.println(str + " -> " + "false");
		}
		return false;
	}
}
