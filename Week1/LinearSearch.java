package Week1;

import java.util.*;

public class LinearSearch {

	public static void search(int[] arr, int k) {
		int i;
		boolean found = false;
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				found = true;
				break;
			}
		}
		
		if(found){
			System.out.println("Present " + (i + 1));
		}
		else{
			System.out.println("Not Present " + i);
		}
		
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
			
			System.out.print("Input key (K): ");
			int K = sc.nextInt();
			
			search(arr, K);
				
		}

	}
}
