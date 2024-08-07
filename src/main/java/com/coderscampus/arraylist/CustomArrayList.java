package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size;

	@Override
	public boolean add(T item) {
		
		//backSize();
		items[size++] = item;		
		return false;
	}

	@Override
	public int getSize() {		
		return size;
	}

	@Override
	public T get(int index) {
		return null;
	}
		
	private void backSize() {
		
		if (size == items.length) {
			//double size of array
			items = Arrays.copyOf(items, items.length * 2);
		}
		
	}
	
}
