/*
 * Author: Himanshu Sajwan.
 * Section: E_30.
 * Roll: 2014402.
 */

package Week2;

import java.util.Scanner;

public class DuplicateElementSearch {

	public static int search(int[] arr, int k){
		
		int result = 0;
		int left = 0, right = arr.length - 1, mid = 0;
		
		if(arr[left] == k){
			mid = left;
		}
		else if(arr[right] == k){
			mid = right;
		}
		else{
			while(left <= right){
				mid = (left + right) >>> 1;
				if(arr[mid] == k){
					break;
				}
				else if(arr[mid] < k){
					left = mid + 1;
				}
				else{
					right = mid - 1;
				}
			}
		}
		
		for(int i = mid; i < arr.length && arr[i] == k; i++){
			result++;
		}
		
		for(int i = mid - 1; i >= 0 && arr[i] == k; i--){
			result++;
		}
		
		return result;
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
			
			int result = search(arr, K);
			if(result != 0){
				System.out.println(K + "-" + result);
			}
			else{
				System.out.println("Key not present");
			}

		}
	}

}


