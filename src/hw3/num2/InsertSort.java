package hw3.num2;

import java.util.Arrays;

public class InsertSort {
	static int[] nums;

	public static void main(String[] args) {
		nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 10);
		}
		System.out.println("<정렬 전>");
		System.out.println(Arrays.toString(nums));
		
		for(int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			int prev = i - 1;
			while(prev >= 0 && nums[prev] > temp) {
				nums[prev + 1] = nums[prev];
				prev--;
			}
			nums[prev + 1] = temp;
		}
		System.out.println("<정렬 후>");
		System.out.println(Arrays.toString(nums));
	}
}