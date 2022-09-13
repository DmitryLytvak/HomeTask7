package ua.ithillel.java;

import ua.ithillel.java.controller.Methods;

public class Main extends Methods {
	
	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		findSymbolOccurance("internet", 'n');
		System.out.println("=".repeat(50));
		findWordPosition("notebook", "book");
		System.out.println("=".repeat(50));
		stringReverse("hillel");
		System.out.println("=".repeat(50));
		isPalindrome("alla");
		System.out.println("=".repeat(50));
		
	}
	
}
