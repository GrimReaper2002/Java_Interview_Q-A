//ArrayList implementation of stack in Java
import java.util.*;

class MyStack{
	ArrayList<Integer> arr = new ArrayList<Integer>();
	//adding element to stack
	void push(int x){
		arr.add(x);
	}
	
	//removing top element in stack
	int pop(){
		int res = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return res;
	}
	
	//retuns top element in stack
	int peek(){
		return arr.get(arr.size()-1);
	}
	boolean isEmpty(){
		return arr.isEmpty();
	}
	int size(){
		return arr.size();
	}
	public static void main(String args[]){
		MyStack s = new MyStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
	}
}
//OverFlow and Underflow conditions can be checked by adding if / else blocks. 
