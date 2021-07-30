/*
 * Author: Himanshu Sajwan.
 * Section: E_30.
 * Roll: 2014402.
 * sequence
 */

package Week2;

import java.util.Scanner;


class NoSequenceFoundException extends Exception{
    
    public NoSequenceFoundException(){
    	super("No sequence found.");
    }
    
}

public class SumSequence {

	public static int[] getSequence(int[] arr) throws NoSequenceFoundException {
		
		int[] res = new int[3];
		boolean found = false;
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length; j++){
				for(int k = j + 1; k < arr.length; k++){
					if(arr[i] + arr[j] == arr[k]){
						res[0] = i + 1;
						res[1] = j + 1;
						res[2] = k + 1;
						found = true;
						break;
					}
				}
			}
		}
		
		if(found){
			return res;
		}
		else{
			throw new NoSequenceFoundException();
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

			try{
				int[] result = getSequence(arr);
				System.out.println(result[0] + "," + result[1] + "," + result[2]);
			}
			catch(NoSequenceFoundException e){
				System.out.println(e.getMessage());
			}

		}

	}
}
