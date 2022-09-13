package Game;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
				"broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
				"mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
				"pineapple", "pumpkin", "potato"};
		String selectedWord = words[(int) Math.floor(Math.random() * words.length)];
		System.out.println("Try to guess the word from the following list:");
		System.out.println();
		System.out.println(Arrays.toString(words));
		System.out.println("=".repeat(165));
		
		String guess;
		StringBuilder indexOfletters;
		do {
			System.out.println("What do you think the computer came up with?");
			guess = myScanner.nextLine();
			System.out.println("=".repeat(60));
			if (Objects.equals(guess, selectedWord)) {
				System.out.println("Correct!");
				
			} else {
				indexOfletters = new StringBuilder("###############");
				int shortWord;
				if (selectedWord.length() < guess.length()) {
					shortWord = selectedWord.length();
				} else {
					shortWord = guess.length();
				}
				for (int i = 0; i < shortWord; i++) {
					if (guess.charAt(i) == selectedWord.charAt(i)) {
						indexOfletters.setCharAt(i, guess.charAt(i));
					}
				}
				System.out.println("You wrong! But maybe some letters below, you guessed it:");
				System.out.println(indexOfletters);
				System.out.println("Try again!");
				System.out.println("=".repeat(60));
			}
		} while (!Objects.equals(guess, selectedWord));
	}
}