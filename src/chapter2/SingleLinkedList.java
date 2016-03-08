package chapter2;

public class SingleLinkedList<E> {
	protected Node<E> head;
	protected Node<E> tail;
	protected long size;

	public SingleLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public void insertAtHead(E newElement) {
		head = new Node<E>(newElement, head);
		if (size == 0)
			tail = head;
		size++;
	}

	public E removeAtHead() {
		if (head != null) {
			E removedElement = head.getElement();
			head = head.getNext();
			size--;
			if (head == null)
				tail = null;
			return removedElement;
		} else
			return null;
	}

	public void insertAtTail(E newElement) {
		Node<E> newNode = new Node(newElement, null);

		if (head != null)
			tail.setNext(newNode);
		else
			head = newNode;

		tail = newNode;
		size++;
	}
	
	public void insertNodeAtTail(Node n)
	{
		if(head != null)
			tail.setNext(n);
		else
			head = n;
		tail = n;
		size++;
	}
	
	public String toString(){
		String toReturn = "";
		Node<E> currNode = head;
		for(int i = 0; i < size; i++){
			toReturn += currNode+ ", ";
			currNode = currNode.getNext();
		}
		
		return toReturn;
	}
	
	public Node<E> intersectingNode(SingleLinkedList<E> otherList){
		Node<E> currNode = head;
		while(currNode != null){
			Node<E> otherNode = otherList.head;
			while(otherNode != null)
			{
				if(otherNode == currNode) return otherNode;
				otherNode = otherNode.getNext();
			}
			currNode = currNode.getNext();
		}
		return null;
	}
}
