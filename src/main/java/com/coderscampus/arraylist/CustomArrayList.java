package com.coderscampus.arraylist;

//import java.util.Arrays;

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
			//items = Arrays.copyOf(items, items.length * 2);
			items = backArraySize(items);
			System.out.println("\n***Increase size of array***\n" + "\n New Size: " + items.length + "\n");
		} else {
			System.out.println("No need to increase size of Array yet");
		}
		
	}
	//just in case I'm not allowed to use java.util.arrays, here is a separate method to handle the doubling of the array
	private Object[] backArraySize(Object[] someArray) {
		
		//create new collection with double the size as the last
		Object[] doubledArray = new Object[someArray.length * 2];
		//copy elements from previous collection to new collection
		System.out.println(doubledArray.length);
		
		//catch the null value at the start, use it to populate the list initially
		if (doubledArray[0] == null) {
			for (int i = 0; i < someArray.length; i++) {
				doubledArray[i] = someArray[i];
			}
		} else { //once initial nulls are changed above, continue to populate
			for (int i = someArray.length-1; i < doubledArray.length; i++) {
				doubledArray[i] = someArray[i];
			}
		}
			
		//send newly copied collection			
		return doubledArray;				
	}
	
}
