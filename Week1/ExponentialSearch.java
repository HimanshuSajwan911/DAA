package Week1;

import java.util.Scanner;

public class ExponentialSearch {

	public static void search(int[] arr, int k) {
	
		boolean found = false;
		int comparisons = 1; 
		
		if(arr[0] == k){
			found = true;
		}
		else{
			int pos = 1;
			while(pos < arr.length && arr[pos] <= k){
				pos = pos * 2;
				comparisons++;
			}
			
			for(int i = pos / 2; i < arr.length; i++){
				comparisons++;
				if(arr[i] == k){
					found = true;
					break;
				}
			}
			
		}
		
		if (found) {
			System.out.println("Present " + comparisons);
		} 
		else {
			System.out.println("Not Present " + comparisons);
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of test cases: ");
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			System.out.print("\nInput number of elements: ");
			int N = sc.nextInt();
			
			System.out.println("Input sorted elements:");
			int[] arr = new int[N];
			
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
			}
			
			System.out.print("Input key (K): ");
			int K = sc.nextInt();
			
			search(arr, K);
				
		}

	}
	
}