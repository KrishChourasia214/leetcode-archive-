package linkedlist;

public class SinglyLinkedList {
	private Node head ;
	private Node tail ;
	private int size ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList() ;
		
		list.insertLast(33) ;
		list.insertFirst(3) ;
		list.insertFirst(45) ;
		list.insertFirst(5) ;
		list.insertFirst(6) ;
		list.insertLast(0);
		list.insertIndex(69, 3) ;
		list.display();
		list.deleteIndex(7) ;
		
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
	
	public void insertLast(int val) {
		if(tail==null) {
			insertFirst(val) ;
			return ;
		}
		Node node = new Node(val) ;
		tail.next = node ;
		tail = node ;
		size++ ;
	}
	
	public void insertIndex(int val, int pos) {
		if(pos == 0) {
			insertFirst(val) ;
			return ;
		}
		if(pos == size) {
			insertLast(val) ;
			return ;
		}
		Node temp = head ;
		for(int i = 1 ; i < pos ; i++) {
			temp = temp.next ;
		}
		
		Node node = new Node(val, temp.next) ;
		temp.next = node ;
		size++ ;
	}
	
	public void deleteFirst() {
		head = head.next ;
		if(head == null) {
			tail = null ;
		}
		size-- ;
	}

	public void deleteLast() {
		if(size<=1) {
			deleteFirst() ;
			return ;
		}
		Node node = get(size-2) ;
		tail = node ;
		tail.next = null ;
		size-- ;
	}
	
	public void deleteIndex(int pos) {
		if(pos==0) {
			deleteFirst() ;
			return ;
		}
		if(pos==size-1) {
			deleteLast() ;
			return ;
		}
		Node prev = get(pos-1) ;
		prev.next =  prev.next.next ;
		size-- ;
	}
	
	public Node get(int idx) {
		Node temp = head ;
		for(int i=1 ; i<idx ; i++) {
			temp = temp.next ;
		}
		return temp ;
	}
	public void display() {
		Node temp = head ;
		while(temp!=null) {
			System.out.print(temp.val + ", ");
			temp = temp.next ;
		}
		System.out.println("null") ;
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
