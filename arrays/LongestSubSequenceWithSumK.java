package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubSequenceWithSumK {
	public static void main(String[] args) {

		int k = 12;
		int arr[] = { 3,5,2,3,4 };
		//bruteForce(arr, k);
		//hashingApproach(arr,k);
		optimalApproach(arr,k);
	}

	private static void bruteForce(int[] arr, int k) {
		int sum = 0;
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = i; j < arr.length; j++) {
//				for (int m = i; m <= j; m++) {
//					sum = sum + arr[m];
//					list.add(arr[m]);
//				}
//				subArraylist.add(list);
				sum = sum + arr[j];
				if (sum == k)
					maxLength = Math.max(maxLength, j - i + 1);
			}
		}
		System.out.println(maxLength);

	}

	private static void hashingApproach(int[] arr, int k) {
		int sum=0;
		int maxLength=0;
		HashMap<Integer,Integer> preSum = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
			if(sum==k){
				maxLength = Math.max(maxLength, i+1);
			}
			int remaining = sum - k;
			if(preSum.containsKey(remaining)){
				int len = i - preSum.get(remaining);
				maxLength = Math.max(maxLength, len);
			}
			if(!preSum.containsKey(sum)){
				preSum.put(sum,i);
			}
		}
		System.out.println(preSum);
		System.out.println(maxLength);

}
	private static void optimalApproach(int[] arr, int k) {
		
		int sum = 0;
		int right = 0;
		int left = 0;
		int maxLength=0;
		while(right<arr.length){
			sum = sum + arr[right];
			while (sum > k) {
	            sum = sum - arr[left];
	            left++;
	        }
			if(sum == k){
				maxLength = Math.max(maxLength, right-left+1);
			}
			right++;
			
		}
		System.out.println(maxLength);

		}
		
	}
