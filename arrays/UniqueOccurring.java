package arrays;

public class UniqueOccurring {
	public static void main(String[] args) {
		int arr[] = { 1,3,2,2,1 };
		int p=0;
		for(int i=0;i<arr.length;i++) {
			p=p^arr[i];
		}
		System.out.println(p);
	}

}
