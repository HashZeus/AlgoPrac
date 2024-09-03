package arrays;

public class MoveAllZeroes {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 3, 0, 0, 7, 0, 9 };
		bruteForce(arr);
		System.out.println();
		optimalSolution(arr);

	}

	public static void bruteForce(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j++] = arr[i];
			}
		}
		for (int k = j; k < arr.length; k++) {
			arr[k] = 0;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void optimalSolution(int arr[]) {
		// 2 ptr approach
		int j = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}
		
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
