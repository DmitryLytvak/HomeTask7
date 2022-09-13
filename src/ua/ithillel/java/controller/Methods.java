package ua.ithillel.java.controller;

public class Methods {
	
	public static int findSymbolOccurance(String str, char sym) {
		int symbol = 0;
		for (char ch : str.toCharArray()) {
			if (ch == sym) {
				symbol++;
			}
		}
		System.out.println("In the text " + symbol + " symbols - " + sym);
		return symbol;
	}
	
	public static void findWordPosition(String source, String target) {
		char nextLine = '\n';
		source.contains(target);
		int index = source.indexOf(target);
		System.out.println("Source: " + source + nextLine + "Target: " + target + nextLine
				+ "Result: " + index);
		
	}
	
	public static String stringReverse(String a) {
		String rev = new StringBuilder(a).reverse().toString();
		System.out.println(a + " -> " + rev);
		return rev;
	}
	public static boolean isPalindrome(String b) {
		StringBuilder str = new StringBuilder(b);
		str.reverse();
		String strReverse = str.toString();
		if (b.equals(strReverse)) {
			System.out.println(b + " -> " + "true");
			return true;
		} else {
			System.out.println(b + " -> " + "false");
		}
		return false;
	}
}
