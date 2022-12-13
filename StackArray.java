//Array implementation of stack in java
import java.util.*;

class MyStack{
	int top;
	int cap;
	int arr[];
	//creating stack with given capacity
	MyStack(int c){
		top=-1;
		cap=c;
		arr = new int[cap];
	}
	
	//pushing an element in stack
	void push(int x){
		if(top!=cap-1){
			top++;
			arr[top]=x;
		}
		else{
			System.out.println("Stack is full");
		}
	}
	
	//removing an top element using pop()
	int pop(){
		if(top!=-1){
			int res = arr[top];
			top--;
			return res;
		}
		else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	int peek(){
		if(top!=-1){
			return arr[top];
		}
		else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	public static void main(String args[]){
		MyStack s = new MyStack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.peek());
	}
	
	
}
