package chapter2;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList<int[]> sLinkedList1 = new SingleLinkedList<int[]>();
		SingleLinkedList<int[]> sLinkedList2 = new SingleLinkedList<int[]>();

		for(int i = 0; i < 5; i++)
		{
			int[] array1 = new int[1];
			int[] array2 = new int[1];
			
			sLinkedList1.insertAtHead(array1);
			sLinkedList2.insertAtHead(array2);
		}
		int[] commonElement = new int[1];
		Node<int[]> commonNode = new Node<int[]>(commonElement, null);
		sLinkedList1.insertNodeAtTail(commonNode);
		sLinkedList2.insertNodeAtTail(commonNode);
		
		System.out.println(sLinkedList1);
		System.out.println(sLinkedList2);
		
		System.out.println(sLinkedList1.intersectingNode(sLinkedList2));
	}
	


}
