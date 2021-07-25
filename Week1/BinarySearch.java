package Week1;

import java.util.Scanner;

public class BinarySearch {

	public static void search(int[] arr, int k) {

		int l = 0, r = arr.length - 1, m;
		boolean found = false;
		int comparisons = 0;

		while (l <= r) {
			
			m = (l + r) >>> 1;
			
			if (arr[m] == k) {
				found = true;
				comparisons++;
				break;
			} 
			else if (arr[m] < k) {
				l = m + 1;
				comparisons++;
			} 
			else if (arr[m] > k) {
				r = m - 1;
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
