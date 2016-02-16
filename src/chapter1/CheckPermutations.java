package chapter1;

import java.util.ArrayList;
import java.util.Collections;

/** Checks if one string is a permutation of the other.
 * Tips:
 * 		- There is one solution that is O(N log N) time. Another solution uses some space, but is O(N) time
 * 		- Could a hash table be useful?
 * 		- Two strings that are permutations should have the same characters, but in different orders. Can you make the orders the same?
 * @author stasiek
 *
 */
public class CheckPermutations {

	public static void main(String[] args) {
		String s1 = "hey how are you";
		String s2 = "how hey you are";

		System.out.println("Strings \"" + s1 + "\" and \"" + s2 + "\" are permutations: " + isPermutation2(s1, s2));
	}

	/* BRUTE FORCE APPROACH TO SOLVE THE QUESION*/
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		ArrayList<Character> s1array = new ArrayList<Character>();
		ArrayList<Character> s2array = new ArrayList<Character>();

		for (int i = 0; i < s1.length(); i++) {
			s1array.add(s1.charAt(i));
			s2array.add(s2.charAt(i));
		}
		Collections.sort(s1array);
		Collections.sort(s2array);

		return s1array.equals(s2array);
	}
	
	/* APPROACH WITH ARRAY OF CHARACTERS*/
	public static boolean isPermutation2(String s1, String s2){
		if (s1.length() != s2.length())
			return false;
		int[] charArray = new int[256];
		for(char c: s1.toCharArray()){
			charArray[c] ++;
		}
		
		for(char c: s2.toCharArray()){
			charArray[c] --;
			if(charArray[c] < 0) return false;
		}
		return true;
		
	}
}
