package com.collections.arraylist;

public class ArrayList {
	private Integer[] array = new Integer[5];
	private Integer count = 0;

	public void add(Integer element) {
		array[count++] = element;
		if (count >= array.length)
			increase();
	}

	public void add(Integer position, Integer element) {
		if (position > count) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int i = count; i > position; i--)
			array[i] = array[i - 1];
		array[position] = element;
		count++;
		if (count >= array.length)
			increase();
	}

	public void increase() {
		Integer[] temporary = new Integer[array.length + 5];
		for (int i = 0; i < array.length; i++)
			temporary[i] = array[i];
		array = temporary;
	}

	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void remove(Integer position) {
		if (position >= count)
			throw new ArrayIndexOutOfBoundsException();
		for (int i = position; i <= count; i++)
			array[i] = array[i + 1];
		count--;
	}

	public int size() {
		return count;
	}
	
	public int get(Integer index) {
		if(index < 0 && index >= count)
			throw new ArrayIndexOutOfBoundsException();
		return array[index];
	}

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.display();
		arrayList.add(0, 5);
		System.out.println(arrayList.size());
		arrayList.display();
		
		arrayList.remove(5);
		System.out.println(arrayList.size());
		arrayList.display();
		
		
		
		
		System.out.println(arrayList.get(0));
	}
}
