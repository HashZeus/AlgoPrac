package arrays;

import java.util.Arrays;

public class TwoSumArray {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4 };
		twoSum(arr, 6);
	}

	public static void twoSum(int[] nums, int target) {
		Arrays.sort(nums);
		int sum = 0;
		int left = 0;
		int right = nums.length-1;
		while (left < right) {
			sum = nums[left] + nums[right];
			if (sum == target) {
				System.out.println(nums[left] + " " + nums[right]);
				return;
			} else if (sum < target) {
				
				sum = sum + nums[left++];
			}
			else
				sum = sum + nums[right--];
		}
		return;
	}
}
