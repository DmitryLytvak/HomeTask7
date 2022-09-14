package ua.ithillel.java;

import ua.ithillel.java.controller.StringUtils;

public class Main extends StringUtils {
	
	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		findSymbolOccurance("internet", 'n');
		System.out.println();
		System.out.println("=".repeat(50));
		findWordPosition("notebook", "book");
		System.out.println();
		System.out.println("=".repeat(50));
		stringReverse("hillel");
		System.out.println();
		System.out.println("=".repeat(50));
		isPalindrome("alla");
		System.out.println();
		System.out.println("=".repeat(50));
		
	}
	
}
