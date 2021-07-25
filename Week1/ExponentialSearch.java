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
			int pos = 2;
			int prev = 1;
			int i;
			while(!found && prev < pos){
				i = prev;
				if(arr[prev] <= k && k <= arr[pos]){
					for(; i <= pos; i++){
						comparisons++;
						if(arr[i] == k){
							found = true;
							break;
						}
					}
				}
				
				prev = pos;
				pos = pos * 2;
				if(pos >= arr.length){
					pos = arr.length - 1;
				}
				if(!found && i < arr.length - 1){
					comparisons++;
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


/*
 *exponential
3
5
12 23 36 39 41
41
8 
21 39 40 45 51 54 68 72
69
10
101 246 438 561 796 896 899 4644 7999 8545
7999
*/
 

