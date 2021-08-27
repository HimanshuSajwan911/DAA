/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week4;

import java.util.Scanner;

public class MergeSort {

	public static int comparisions, inversions;
	
	static void merge(int[] arr, int l, int m, int r){
		
		int mr = m + 1;
		
		int[] tar = new int[r + 1];
		for(int i = 0; i <= r; i++){
			tar[i] = arr[i];
		}
		
		int pos = l;
		while(l <= m && mr <= r){
		
			if(tar[l] > tar[mr]){
				arr[pos++] = tar[mr++];
				inversions += (m - l + 1);
			}
			else{
				arr[pos++] = tar[l++];
			}
			comparisions++;
		}
		
		while(l <= m){
			arr[pos++] = tar[l++];
		}
		
		while(mr <= r){
			arr[pos++] = tar[mr++];
		}
		
	}
	
	static void mergeSort(int[] arr, int l, int r){
		
		if(l < r){
			int mid = l + (r - l) / 2;
			
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			
			merge(arr, l, mid, r);
		}
		
	}
	
	static void sort(int[] arr){
		comparisions = 0;
		inversions = 0;
		mergeSort(arr, 0, arr.length - 1);
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
			System.out.println("Inversions= " + inversions);

		}
		
	}
	
}