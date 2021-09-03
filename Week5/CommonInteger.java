/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonInteger {

	public static ArrayList<Integer> findCommon(int[] A, int[] B){
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		int a = 0, b = 0;
		
		while(a < A.length && b < B.length){
			
			if(A[a] == B[b]){
				res.add(A[a]);
				a++;
				b++;
			}
			else if(A[a] > B[b]){
				b++;
			}
			else{
				a++;
			}
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input size of first array: ");
		int a = sc.nextInt();
		
		int[] A = new int[a];
		
		System.out.println("Input sorted elements: ");
		for(int i = 0; i < a; i++){
			A[i] = sc.nextInt();
		}
		
		System.out.print("\nInput size of second array: ");
		int b = sc.nextInt();
		
		int[] B = new int[b];
		
		System.out.println("Input sorted elements: ");
		for(int i = 0; i < b; i++){
			B[i] = sc.nextInt();
		}
		
		System.out.println();
		ArrayList<Integer> res = findCommon(A, B);
		for(int r : res){
			System.out.print(r + " ");
		}
		
	}

}