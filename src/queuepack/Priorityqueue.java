package queuepack;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.add("D");
		pq.add("R");
		pq.add("E");
		System.out.println("the elements are:"+pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll()); //sorted order due it will poll the head order.
		}
		
		
	}

}
