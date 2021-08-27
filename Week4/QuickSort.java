/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week4;

import java.util.Scanner;

public class QuickSort {

	public static int comparisions, swaps;
	
	private static void quickSort(int[] arr, int l, int r){
		
		if(l < r){
		
			int i = l, j = l, p = r;
			
			while(i < r){
				if(arr[i] < arr[p]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					j++;
					swaps++;
				}
				i++;
				comparisions++;
			}
			
			int t = arr[p];
			arr[p] = arr[j];
			arr[j] = t;
			swaps++;
			
			quickSort(arr, l, j - 1);
			quickSort(arr, j + 1, r);
		}
		
	}
	
	static void sort(int[] arr){
		
		comparisions = 0;
		swaps = 0;
		
		quickSort(arr, 0, arr.length - 1);
		
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
			
			sort(arr);
			for(int k = 0; k < N; k++){
				System.out.print(arr[k] + " ");
			}
			
			System.out.println("\nComparisions= " + comparisions);
			System.out.println("Swaps= " + swaps);

		}
		
	}
	
}