package com;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		//int item = queue.dequeue();
		//System.out.println(item + " dequeued");
		System.out.println("\nArray Output " + queue.size);
		Arrays.stream(queue.array).mapToObj(i -> Integer.toUnsignedString(i, 64)).forEach(System.out::println);

	}

}
