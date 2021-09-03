/*
 * Author: 	Himanshu Sajwan.
 * Section: E_30.
 * Roll: 	2014402.
 */

package Week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.util.Pair;

class NoSuchPairException extends Exception {

    NoSuchPairException() {
        super("No Such Pair Exist");
    }
}

public class PairForSum {

    public static ArrayList<Pair<Integer, Integer>> searchPair(int[] arr, int k) throws NoSuchPairException {

        ArrayList<Pair<Integer, Integer>> res = new ArrayList<Pair<Integer, Integer>>();

        Arrays.sort(arr);
        
        int l = 0, r = arr.length - 1;
        
        while(l < r){
            int sum = arr[l] + arr[r];
            if(sum == k){
                res.add(new Pair(arr[l], arr[r]));
                r--;
            }
            else if(sum < k){
                l++;
            }
            else{
                r--;
            }
        }
        
        if(res.isEmpty()){
            throw new NoSuchPairException();
        }
        
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

            try {
                ArrayList<Pair<Integer, Integer>> res = searchPair(arr, K);
                int n = res.size();
                for(Pair<Integer, Integer> a : res){
                    System.out.print(a.getKey() + " " + a.getValue());
                    if(n > 1){
                        System.out.print(", ");
                        n--;
                    }
                }
                System.out.println("");
            } 
            catch (NoSuchPairException ex) {
                System.out.println(ex.getMessage());
            }
            
        }

    }

}