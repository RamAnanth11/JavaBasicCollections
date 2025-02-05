package com.datastructure;

import java.util.PriorityQueue;

public class PriorityQueueLearning {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(40);
		priorityQueue.add(20);
		priorityQueue.add(60);
		priorityQueue.add(10);
		priorityQueue.add(30);
		priorityQueue.add(50);

		priorityQueue.forEach(e -> System.out.println(e));

	}

}
