/*  You’re given an array with an even number of elements. You want to check if it can be split into two non-empty subarrays 
 𝑎 and 𝑏
*/

import java.util.Scanner;

public class SubarraySplitSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		System.out.print(splitSum(arr));
	}
	public static boolean splitSum(int[] arr){
		int total = 0;
		for(int n: arr){
			total+=n;
		}
		if(total %2 !=0) return false;
		int target = total /2;
		int prefixSum= 0;
		for(int i=0;i<arr.length-1;i++){
			prefixSum+=arr[i];
			if(prefixSum == target) return true;
		}
		return false;
	}
}