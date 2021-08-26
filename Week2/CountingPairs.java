/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week2;

import java.util.Scanner;

public class CountingPairs {

	public static int countPairs(int[] arr, int k) {
		int res = 0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(Math.abs(arr[i] - arr[j]) == k){
					res++;
				}
			}
		}
		
		return res;
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

			int result = countPairs(arr, K);
			
			System.out.println(result);

		}
	}
}