package com.project.linkedlist;

public class ArrayList {
	Object[] a = new Object[5];
	int p = 0;

	// Add an element to the end of a list
	public void add(Object ele) {
		if (p >= a.length)
			increase();
		a[p++] = ele;
	}

	// Add an element to the specific index of the list
	public void add(int index, Object ele) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (p >= a.length)
			increase();
		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = ele;
		p++;
	}

	// Get the current size of the list
	public int size() {
		return p;
	}

	// Increase the size of the internal array
	private void increase() {
		Object[] temp = new Object[a.length + 3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a = temp;
	}

	// Get the element at the specific indx of the list
	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}

	// Remove the element at the specific index of the list
	public void remove(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = index + 1; i < size(); i++) {
			a[i - 1] = a[i];
		}
		p--;
		a[p] = null;
	}
}