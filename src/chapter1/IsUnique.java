package chapter1;

import java.util.ArrayList;
import java.util.HashMap;

public class IsUnique {

	public static void main(String[] args) {
		String input = "Heloa";

		System.out.println(input + " has all unique characters: " + checkUniqueSmart(input));
		
		System.out.println((int)input.charAt(1));
	}

	/* BRUTE FORCE APPROACH AND USED ADDITIONAL DATA STRUCTURES -> BIG-O ( n^2 ) */
	public static boolean checkUniqueCharacters0(String s) {
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
	
	/* BRUTE FORCE APPROACH AND NO ADDITIONAL DATA STRUCTURES -> BIG-O ( n^2 ) */
	public static boolean checkUniqueCharacters1(String s) {
		char[] charUsed = new char[s.length()];
		int cnt = 0;
		for (int index = 0; index < s.length(); index++) {
			char currentLetter = s.charAt(index);
			for (int j = 0; j < charUsed.length; j++) {
				if (currentLetter == charUsed[j])
					return false;
			}
			charUsed[cnt] = currentLetter;
			cnt++;
		}
		return true;
	}
	
	/* USE OF HASH-TABLE -> SHOULD RESULT IN BIG-O ( n * log n ) */
	
	public static boolean checkUniqueCharacters2(String s) {
		HashMap<Character, Character> hashMap = new HashMap<>();
		
		for (int index = 0; index < s.length(); index++) {
			char currentLetter = s.charAt(index);
			if(hashMap.containsKey(currentLetter))
				return false;
			else
			{
				hashMap.put(currentLetter, null);
			}
		}
		return true;
	}
	
	/* Smart version*/

	public static boolean checkUniqueSmart(String s) {
		int[] arrayOfChars = new int[256];
		for(char c : s.toCharArray()){
			if(arrayOfChars[c] != 0)
				return false;
			else
				arrayOfChars[c] = 1;
		}
		return true;
	}
}
