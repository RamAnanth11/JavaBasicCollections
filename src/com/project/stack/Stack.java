package com.project.stack;

import java.util.EmptyStackException;

public class Stack {

	private Integer[] stack = new Integer[5];
	private Integer count = 0;

	public void increase() {
		Integer[] temporary = new Integer[stack.length + 5];
		for (int i = 0; i < stack.length; i++)
			temporary[i] = stack[i];
		stack = temporary;
	}

	public void push(Integer element) {
		stack[count++] = element;
		if (count >= stack.length)
			increase();
	}

	public Integer pop() {
		if (count == 0)
			throw new EmptyStackException();
		Integer pop = stack[count - 1];
		count--;
		return pop;
	}

	public Integer size() {
		return count;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.size());
		stack.push(40);
		stack.push(50);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());

	}

}
