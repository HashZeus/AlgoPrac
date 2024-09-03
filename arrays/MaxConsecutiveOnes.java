package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaxConsecutiveOnes {
	
	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 1, 1, 1 };
		bruteForce(arr);
		System.out.println();
		//optimalSolution(arr);

}

	private static void bruteForce(int[] arr) {
		int count = 0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				max=count;
			}
			if(arr[i]==0) {
				count=0;
			}
		}
		System.out.println(max);
		max=Math.max(max, max);
	}
}
