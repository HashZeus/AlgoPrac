package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Union {

	public static void main(String[] args) {
		int arr1[] = { 1, 1, 2, 3, 4, 5 };
		int arr2[] = { 2, 2, 4, 4, 5, 6 };
		List<Integer> unionList = new ArrayList<>();
		System.out.println(unionList.size());
		// bruteForce(arr1, arr2, arr1.length, arr2.length);
		optimalSolution(arr1, arr2, arr1.length, arr2.length);

	}

	public static void bruteForce(int arr1[], int arr2[], int n1, int n2) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n1; i++)
			set.add(arr1[i]);
		for (int j = 0; j < n2; j++)
			set.add(arr2[j]);

		int arr3[] = new int[set.size()];
		int m = 0;
		for (int k : set) {
			arr3[m++] = k;
		}

		for (int a : arr3) {
			System.out.print(a + " ");
		}
	}

	public static void optimalSolution(int arr1[], int arr2[], int n1, int n2) {
		// 2 ptr app
		// int arr1[] = { 1, 1, 2, 3, 4, 5 };
		// int arr2[] = { 2, 2, 4, 4, 5, 6 };
		int i = 0;
		int j = 0;
		List<Integer> unionList = new ArrayList<>();
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				if (unionList.size()==0 || unionList.get(unionList.size() - 1) != arr1[i])
					unionList.add(arr1[i]);
				i++;
			} else {
				if (unionList.size()==0 || unionList.get(unionList.size() - 1) != arr2[j])
					unionList.add(arr2[j]);
				j++;
			}
		}
		while (i < n1) {
			if(unionList.get(unionList.size() - 1) != arr1[i])
			unionList.add(arr1[i]);
			i++;
		}
		while (j < n2) {
			if(unionList.get(unionList.size() - 1) != arr2[j])
			unionList.add(arr2[j]);
			j++;
		}
		for (int a : unionList) {
			System.out.print(a + " ");
		}
	}
}
