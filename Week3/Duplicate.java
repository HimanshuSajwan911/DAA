/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week3;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

    public static String isDuplicate(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]){
            	return "YES";
            }
        }
        
        return "NO";
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

            String res = isDuplicate(arr);
            System.out.println(res);

        }

    }

}