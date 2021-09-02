/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week5;

import java.util.Scanner;

public class MaxAlphabet {

	public static String maxAlphabet(char[] arr){
		
		int[] alpha = new int[26];
		
		for(int i = 0; i < arr.length; i++){
			alpha[arr[i] - 'a']++;
		}
		
		int max = 0;
		char c = '.';
		for(int i = 0; i < 26; i++){
			if(alpha[i] > 1 && alpha[i] > max){
				max = alpha[i];
				c = (char)('a' + i);
			}
		}
		
		if(c != '.'){
			return c + " - " + max;
		}
		
		return "No Duplicates Present";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Input number of test cases: ");
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.print("\nInput number of elements: ");
            int N = sc.nextInt();

            System.out.println("Input elements:");
            char[] arr = new char[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.next().charAt(0);
            }

            String res = maxAlphabet(arr);
            
            System.out.println(res);
            
        }
		
	}

}