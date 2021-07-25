package Week1;

import java.util.*;

public class JumpSearch {

	public static void search(int[] arr, int k) {
	
		boolean found = false;
		int comparisons = 0;

		int prev = 0, i = 0;
		int jump = (int) Math.floor(Math.sqrt(arr.length));
		
		while(!found && prev <= jump){
			i = prev;
			if(arr[prev] <= k && k <= arr[jump]){
				
				for(; i <= jump; i++){
					comparisons++;
					if(arr[i] == k){
						found = true;
						break;
					}
				}
				
				if(i >= arr.length - 1 || found){
					break;
				}
			}
			
			prev = jump + 1;
			if ((jump * 2) + 1 >= arr.length) {
				jump = arr.length - 1;
			} 
			else {
				jump += jump + 1;
			}

			if(!found && i < arr.length - 1){
				comparisons++;
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