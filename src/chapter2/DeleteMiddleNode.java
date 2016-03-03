package chapter2;

import java.util.LinkedList;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> list = new LinkedList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		
		System.out.println("Original list: "+list);
		deleteMiddleNode(list);
		System.out.println(list);
		deleteMiddleNode(list);
		System.out.println(list);


	}

	public static void deleteMiddleNode(LinkedList<Character> list) {

		list.remove(list.size()/2);
		
	}
}
