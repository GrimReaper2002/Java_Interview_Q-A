import java.util.*;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}

class MyLinkedList{
	public static void printList(Node head){
		Node curr = head;
		while(curr!=null){
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	static void rPrintList(Node head){
		if(head==null){
			return;
		}
		System.out.print(head.data+" ");
		rPrintList(head.next);
	}
	
	public static void main(String args[]){
		Node head = new Node(10);
		head.next= new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		printList(head);
		rPrintList(head);
	}
}