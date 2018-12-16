package com.algorithms.CLRS.Sorting;

public class TestHarness {

	public static void main(String[] args) {
		int array[] = { 9, 6, 5, 4, 3, 2 };
		printArray(array);
		Sortable insertionSort = new InsertionSort() ;
		insertionSort.sort(array);
		printArray(array);

	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();

	}

}
