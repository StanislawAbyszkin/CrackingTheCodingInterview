package chapter2;

public class Node<E> {
	private E element;
	private Node<E> next;
	
	public Node(E ele, Node next){
		this.element = ele;
		this.next = next;
	}
	
	public Node(){
		this(null,null);
	}
	
	public E getElement(){
		return element;
	}
	
	public Node<E> getNext(){
		return next;
	}
	
	public void setElement(E newElement){
		this.element = newElement;
	}
	
	public void setNext(Node<E> newNext){
		this.next = newNext;
	}
}
