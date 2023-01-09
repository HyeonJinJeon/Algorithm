package hw3.num1;

import java.util.Arrays;

public class ThreeSum { 
	// array is assumed to be sorted in non-descreasing order 
	public static int[] twoSumSortedArray(int[] array, int sum, int indexNotToBeConsidered) { 
		if (null == array) { 
			return null; 
		} else { 
			int[] result = new int[2]; 
			int start = 0; 
			int end = array.length - 1; 
			int tempSum = 0; 
			if (start == indexNotToBeConsidered) { 
				start++; 
			} 
			if (end == indexNotToBeConsidered) { 
				end--; 
			} 
			while (start < end) { 
				tempSum = array[start] + array[end]; 
				if (tempSum == sum) { 
					result[0] = start; 
					result[1] = end; 
					return result; 
				} else if (tempSum < sum) { 
					start++; 
				} else { 
					end--; 
				} 
				if (start == indexNotToBeConsidered) { 
					start++; 
				} 
				if (end == indexNotToBeConsidered) { 
					end--; 
				} 
			} 
			return null; 
		} 
	} 
 
	public static int[] threeSumSortedArray(int[] array, int sum) { 
		if (null == array) { 
			return null; 
		} else { 
			int[] result = new int[3]; 
			int[] tempResult = null; 
			for (int i = 0; i < array.length; i++) { 
				tempResult = twoSumSortedArray(array, sum - array[i], i); 
				if (tempResult != null) { 
					result[0] = i; 
					result[1] = tempResult[0]; 
					result[2] = tempResult[1]; 
					return result; 
				} 
			} 
		} 
		return null; 
	} 
 
	public static void showArray(int[] array) { 
		if (null == array) { 
			return; 
		} else { 
			for (int i = 0; i < array.length; i++) { 
				System.out.print(array[i] + "  "); 
			} 
			System.out.println(); 
		} 
	} 
 
	public static void showResult(int[] array, int[] indexes, int sum) { 
		if (null == array || indexes == null) { 
			System.out.println("No results found for sum: " + sum); 
		} else { 
			System.out.println(array[indexes[0]] + " + " + array[indexes[1]] + " + " + array[indexes[2]] + " = " + sum); 
		} 
	} 
 
	public static void testingWithRandomNumbers() { 
		int[] array = new int[20]; 
 
		for (int i = 0; i < array.length; i++) { 
			array[i] = (int) (Math.random() * 20); 
		} 
		Arrays.sort(array); 
		showArray(array); 
 
		for (int i = 0; i < 10; i++) { 
			int sum = (int) (Math.random() * 200); 
			int[] indexes = threeSumSortedArray(array, sum); 
			showResult(array, indexes, sum); 
		} 
	} 
 
	public static void testingWithGivenData() { 
		int[] array = { 2, 5, 7, 1, 7, 9, 3, 9, 23, 21, 9, 0, -1, -5 }; 
		Arrays.sort(array); 
		showArray(array); 
		int[] indexes = threeSumSortedArray(array, 19); // -5 + 1 + 23 
		showResult(array, indexes, 19); 
 
		indexes = threeSumSortedArray(array, 4); // -5 + 0 + 9 
		showResult(array, indexes, 4); 
 
		indexes = threeSumSortedArray(array, 1000); // Not found 
		showResult(array, indexes, 1000); 
 
	} 
 
	public static void main(String[] args) { 
		testingWithRandomNumbers(); 
		testingWithGivenData(); 
	} 
} 