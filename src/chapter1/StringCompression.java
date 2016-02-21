package chapter1;

import java.util.ArrayList;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcccddd";
		System.out.println(compressString(s));
	}

	public static String compressString(String s) {
		StringBuilder stringToReturn = new StringBuilder();
		char previousChar = s.charAt(0);
		int cnt = 0;
		ArrayList<Character> charArray = new ArrayList<>();
		ArrayList<Integer> charCounter = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (previousChar == c)
				cnt++;
			else {
				charArray.add(previousChar);
				charCounter.add(cnt);
				cnt = 1;
			}
			previousChar = c;

			if (i == s.length() - 1) {
				charArray.add(previousChar);
				charCounter.add(cnt);
			}
		}
		for (int i = 0; i < charArray.size(); i++) {
			char charToAppend = charArray.get(i);
			int noOfChars = charCounter.get(i);
			stringToReturn.append(charToAppend);
			stringToReturn.append(noOfChars);
		}
		if(stringToReturn.length() < s.length())
			return stringToReturn.toString();
		else
			return s;
	}
}
