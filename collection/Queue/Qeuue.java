package collection.Queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Qeuue {

	public static void main(String[] args) {

		Queue<Integer> q= new ArrayBlockingQueue<>(6);
		
		//add the element
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(6);
		System.out.println(q.offer(7));
		
		//POLL will delete the first element
		q.poll();
		
		//PEEK will tell the first element of the queue
		System.out.println("first element of the queue is "+q.peek());
		
		for(Integer i:q) {
			System.out.println(i);
		}
		
		
		
	}

}
