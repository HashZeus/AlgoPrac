package arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4, 5 };
		//hashingApproach(arr1);
		optimalSolution(arr1,5);
		
	}

	private static void optimalSolution(int[] arr,int n) {
		int xor1=0;
		int xor2=0;
//		for(int i=1;i<=n;i++) {
//			xor1^=i;
//		}
		for(int i=0;i<arr.length;i++) {
			xor2^=arr[i];
			xor1^=i+1;
		}
		int result=xor1^xor2^n;
		System.out.println(result);
				
		
	}

	private static void hashingApproach(int[] arr) {
		int missing=0;
		int[] hashArray = new int[arr.length+1];
		for(int i=0;i<arr.length-1;i++) {
			hashArray[arr[i]]=1;
		}
		for(int i=1;i<hashArray.length;i++) {
			if(hashArray[i]==0) {
				missing = i;
				break;
			}
		}
		System.out.println(missing);
		
	}

}
