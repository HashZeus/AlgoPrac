package arrays;

public class AppearingOnceOthersTwice {
	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,4,4};
		hashingApproach(arr);
	}
	private static void hashingApproach(int arr[]){
		int max=0;
		int once=0;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max,arr[i]);
		}
		int hashArray[] = new int[max+1];
		for(int i=0;i<arr.length;i++){
			hashArray[arr[i]]++;
		}
		for (int i = 0; i < arr.length; i++) {
            if (hashArray[arr[i]] == 1){
            	once = i;
				break;
			}
        }
		System.out.println(once);

	}

}
