package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue q1 = new PriorityQueue();
		q1.add(1000);
		q1.add(20);
		q1.add(300);
		q1.add(050);
		q1.add(1);
		q1.add(1);

		q1.add(301);
		q1.offer(50);
		System.out.println(q1);
		//System.out.println(q1.element());
		//System.out.println(q1.peek());
		//System.out.println("remove element"+q1.remove());
		//System.out.println(q1);
		//System.out.println("remove element"+q1.poll());
		//System.out.println(q1);
		
		/*
		 * LinkedList q1 = new LinkedList(); q1.add(1000); q1.add(20); q1.add(300);
		 * q1.add(050); q1.add(1); q1.add(301); System.out.println(q1);
		 */
		System.out.println("iterator method");
	Iterator i=q1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	System.out.println("for each");
	for(Object s:q1) {
		System.out.println(s);
	}
	}

}
