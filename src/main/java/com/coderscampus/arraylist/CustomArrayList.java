package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size;

	@Override
	public boolean add(T item) {
		
		backSize(); //method to "back" the Object array
		items[size++] = item; //insert element into Object array, increment the size variable
		return false;
	}

	@Override
	public int getSize() {		
		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index Out of Bounds Exception!");
		}
		return (T) items[index];
	}
		
	private void backSize() {
		
		if (size == items.length) {
			//double size of array
			items = Arrays.copyOf(items, items.length * 2);
			System.out.println("\n***Increase size of array***\n" + "\n New Size: " + items.length + "\n");
		} else {
			System.out.println("No need to increase size of Array yet");
		}
		
	}
	
}
