package linkedlist;

public class SinglyLinkedList {
	private Node head ;
	private Node tail ;
	private int size ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList() ;

		list.insertFirst(3) ;
		list.insertFirst(45) ;
		list.insertFirst(5) ;
		list.insertFirst(6) ;
		
		list.display();
	}
		
	public SinglyLinkedList() {
		this.size = 0 ;
	}
		
	public void insertFirst(int val) {
		Node node = new Node(val) ;
		node.next = head ;
		head = node ;
		
		if(tail==null) {
			tail = head ;
		}
		size++ ;
	}

	public void display() {
		Node temp = head ;
		while(temp!=null) {
			System.out.print(temp.val + ", ");
			temp = temp.next ;
		}
		System.out.print("null") ;
	}
	private class Node {
		private int val ;
		private Node next ;
		
		public Node(int val) {
			this.val = val ;
		}
		
		public Node(int val, Node next) {
			this.val = val ;
			this.next = next ;
		}
	}

	

}
