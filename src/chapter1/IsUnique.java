package chapter1;

import java.util.ArrayList;

public class IsUnique {

	public static void main(String[] args) {
		String input = "Hej";

		System.out.println(input + " has all unique characters: " + checkUniqueCharacters(input));
	}

	/* BRUTE FORCE APPROACH AND USED ADDITIONAL DATA STRUCTURES -> BIG-O ( n^2 ) */
	public static boolean checkUniqueCharacters(String s) {
		ArrayList<Character> charUsed = new ArrayList<Character>();

		for (int index = 0; index < s.length(); index++) {
			char currentLetter = s.charAt(index);
			for (char c : charUsed) {
				if (currentLetter == c)
					return false;
			}
			charUsed.add(currentLetter);
		}
		return true;
	}
}
