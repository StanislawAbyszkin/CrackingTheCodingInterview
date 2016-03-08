package chapter2;

import java.util.LinkedList;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> list = new LinkedList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('b');
		list.add('a');
		
		System.out.println(isPalindrome(list));
	}
	public static boolean isPalindrome(LinkedList<Character> list) {
		for (int i = 0; i < list.size() / 2; i++) {
			if (list.get(i) != list.get(list.size() - i - 1)) return false;
		}

		return true;
	}
}
