package Week4;

import java.util.Scanner;

public class QuickSearch {

	
	private static int search(int[] arr, int l, int r, int k){
		
		int res = -1;
		
		if(l <= r){
			
			int i = l, j = l, p = r;
			while(i < r){
				if(arr[i] < arr[p]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					j++;
				}
				i++;
			}
			
			int t = arr[p];
			arr[p] = arr[j];
			arr[j] = t;
			
			if((j + 1) == k){
				return arr[j];
			}
			else if((j + 1) < k){
				return search(arr, j + 1, r, k);
			}
			else{
				return search(arr, l, j - 1, k);
			}
			
		}
		
		return res;
	}
	
	public static int quickSearch(int[] arr, int K){
		
		return search(arr, 0, arr.length - 1, K);
		
	}
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of test cases: ");
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.print("\nInput number of elements: ");
			int N = sc.nextInt();
			
			System.out.println("Input elements:");
			int[] arr = new int[N];
			
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
			}
			
			System.out.print("Input K: ");
			int K = sc.nextInt();
			
			int res = quickSearch(arr, K);

			if(res == -1){
				System.out.println("not present");
			}
			else{
				System.out.println(res);
			}
			
		}
		
	}
}