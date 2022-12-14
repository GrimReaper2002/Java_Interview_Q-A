import java.util.*;

class MyQueue{
	public static void main(String args[]){
		//Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.offer(10);//Adding element into queue(Enqueue)
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println(q.peek());
		System.out.println(q.poll());//Dequeue
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q);
	}
}