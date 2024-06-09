package com.collections.stackandqueue;

import java.util.EmptyStackException;

public class Queue {

	private Integer[] queue = new Integer[5];
	private Integer count = 0;

	public void push(Integer element) {
		queue[count++] = element;
		if (count >= queue.length)
			increase();
	}

	public Integer pop() {
		if (count == 0)
			throw new EmptyStackException();
		Integer result = queue[0];
		for (int i = 0; i < count; i++)
			queue[i] = queue[i + 1];
		count--;
		return result;
	}

	public void increase() {
		Integer[] temporary = new Integer[queue.length + 5];
		for (int i = 0; i < count; i++)
			temporary[i] = queue[i];
		queue = temporary;
	}

	public Integer size() {
		return count;
	}

	public static void main(String[] args) {
		Queue que = new Queue();
		que.push(10);
		que.push(20);
		que.push(30);
		que.push(40);
		que.push(50);
		System.out.println(que.size());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());

	}

}
