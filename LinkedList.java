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
	public static Node insertAtBegin(Node head, int x){
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}
 
	public static Node insertAtEnd(Node head,int x){
		Node temp = new Node(x);
		if(head == null){
			return temp;
		}
		Node curr = head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=temp;
		return head;
	}
	public static void printList(Node head){
		Node curr = head;
		while(curr!=null){
			System.out.println(curr.data);
			curr = curr.next;
		}
	}
	public static void main(String args[]){
		Node head = null;
		head = insertAtEnd(head,1);
		head = insertAtEnd(head,2);
		head = insertAtEnd(head,3);
		head = insertAtBegin(head,10);
		head = insertAtBegin(head,20);
		head = insertAtBegin(head,30);
		printList(head);
	}
}