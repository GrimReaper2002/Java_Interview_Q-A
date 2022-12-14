//IMPLEMENTATION OF QUEUE USING ARRAY
import java.util.*;

class MyQueue{
	int front,rear,capacity;
	int queue[];
	
	//creating an array with given size
	MyQueue(int c){
		front = rear =0;
		capacity = c;
		queue = new int[c];
	}
	
	//adding element in queue
	void enqueue(int x){
		if(capacity==rear){
			System.out.println("Queue is full");
		}
		else{
			queue[rear]=x;
			rear++;
		}
	}
	
	//removing an element in queue
	int dequeue(){
		if(front==rear){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int res= queue[front];
			for(int i=0;i<rear-1;i++){
				queue[i]=queue[i+1];
			}
			rear--;
			return res;
		}
	}
	
	//return first element in queue
	int getFront(){
		if(front==rear){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			return queue[front];
		}
	}
	
	//return last element of queue
	int getRear(){
		if(front==rear){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			return queue[rear-1];
		}
	}
	
	public static void main(String args[]){
		MyQueue q = new MyQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.dequeue());
		System.out.println(q.getFront());
		System.out.println(q.getRear());
	}
}
