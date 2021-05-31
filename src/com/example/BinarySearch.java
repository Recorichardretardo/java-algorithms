package com.example;

public class BinarySearch {
	// Data must be sorted!
	// Chooses the element in the middle of the array and compares it against the
	// search value
	// if element is equal to the value, we're done
	// if element is greater than the value, search the left half of the array
	// if the element is less than the value, search the right half of the array

	public static void main(String[] args) {
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
		System.out.println(iterativeBinarySearch(intArray, 55));
		System.out.println(iterativeBinarySearch(intArray, 1));
		System.out.println(iterativeBinarySearch(intArray, 8888));
		System.out.println(iterativeBinarySearch(intArray, 120));
	}

	public static int iterativeBinarySearch(int[] input, int value) {
		int start = 0;
		int end = input.length;
		while (start < end) {
			int midpoint = (start + end) / 2;
			System.out.println("midpoint : " + midpoint);
			if (input[midpoint] == value) {
				return midpoint;
			} else if (input[midpoint] < value) {
				start = midpoint + 1;
			} else {
				end = midpoint;
			}
		}
		return -1;
	}

}
