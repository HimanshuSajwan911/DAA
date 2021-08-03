/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week3;

import java.util.Scanner;

public class InsertionSort {

	public static String sort(int[] arr){
		int i, j;
		int comparisons = 0;
		int shifts = 0;
		for(i = 1; i < arr.length; i++){
			int temp = arr[i];
			for(j = i - 1; j >= 0 && arr[j] > temp; j--){
				arr[j + 1] = arr[j];
				shifts++;
				comparisons++;
			}
			arr[j + 1] = temp;
			shifts++;
		}
		
		return new String(comparisons + "," + shifts);
		
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
			System.out.println("shifts = " + res.substring(res.lastIndexOf(',') + 1));

		}
		
	}

}

/*
3
8
-23 65 -31 76 46 89 45 32
10
54 65 34 76 78 97 46 32 51 21
15
63 42 223 645 652 31 324 22 553 -12 54 65 86 46 325

*/
