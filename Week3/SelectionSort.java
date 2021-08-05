/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */


package Week3;

import java.util.Scanner;

public class SelectionSort {
	
	static void print(int arr[]){
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static String sort(int[] arr){
		int i, j, pos = 0, ind = 0;
		int comparisons = 0;
		int swaps = -1;
		for(i = 0; i < arr.length; i++){
			int min = arr[pos];
			ind = pos;
			for(j = pos + 1; j < arr.length; j++){
				if(min > arr[j]){
					min = arr[j];
					ind = j;
				}
				comparisons++;
			}
			
			int t = arr[ind];
			arr[ind] = arr[pos];
			arr[pos] = t;
			swaps++;
			pos++;
		}
		
		return new String(comparisons + "," + swaps);
		
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
			
			String res = sort(arr);
			for(int k = 0; k < N; k++){
				System.out.print(arr[k] + " ");
			}
			
			System.out.println("\ncomparisons = " + res.substring(0, res.lastIndexOf(',')));
			System.out.println("swaps = " + res.substring(res.lastIndexOf(',') + 1));

		}
	}
}