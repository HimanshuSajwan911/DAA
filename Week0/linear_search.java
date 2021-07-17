package DAA;

import java.util.*;

public class linear_search {

	public static boolean search(int[] arr, int k){
		int i;
		boolean res = false;;
		for(i = 0; i < arr.length; i++){
			if(arr[i] == k){
				res = true;
				break;
			}
		}
		System.out.println("Total number of comparisons = " + (i + 1));
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
			
			if(search(arr, K)){
				System.out.println("Yes! key(" + K + ") is present in array.");
			}
			else{
				System.out.println("No! key(" + K + ") is not present in array.");
			}

		}

	}

}

