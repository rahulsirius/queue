package com;

import java.util.HashMap;

public class Queue {

	int front, rear, size, capacity;
	int array[];
	
	public Queue(int capacity) {
		super();
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	boolean isFull(Queue queue){
		return (queue.size == queue.capacity);
	}
	
	boolean isEmpty(Queue queue){
		return (queue.size == 0);
	}

	void enqueue(int item){
		if(isFull(this))
			return;
		this.rear = (this.rear + 1)%this.capacity;
		this.array[this.rear] = item;
		this.size++;
		System.out.println(item + "enqueued to queue");
	}
	
	int dequeue(){
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		int item = this.array[this.front];
		this.front = (this.front + 1)%this.capacity;
		this.size--;
		return item;
	}
	
	int front(){
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	
	int rear(){
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array[this.rear];
	}
	
	
	
}
