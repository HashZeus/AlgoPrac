package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 1, 2, 3, 4, 5 };
		int arr2[] = { 2, 3, 4, 4, 5 };
		bruteForce(arr1, arr2, arr1.length, arr2.length);
		System.out.println();
		optimalSolution(arr1, arr2, arr1.length, arr2.length);

	}
	
	private static void bruteForce(int[] arr1, int[] arr2, int n1, int n2) {
		List<Integer> commons = new ArrayList<>();
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if (arr1[i] == arr2[j]) {
				if (commons.size() == 0 || commons.get(commons.size() - 1) != arr1[i])
					commons.add(arr1[i]);
				}
			}
		}
		for (int a : commons) {
			System.out.print(a + " ");
		}
	}

	private static void optimalSolution(int[] arr1, int[] arr2, int n1, int n2) {
		List<Integer> commons = new ArrayList<>();

		int i = 0;
		int j = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] == arr2[j]) {
				if (commons.size() == 0 || commons.get(commons.size() - 1) != arr1[i])
					commons.add(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else
				j++;
		}
		for (int a : commons) {
			System.out.print(a + " ");
		}
	}

}
