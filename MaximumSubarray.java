import java.util.Scanner;
//import java.util.Arrays;

public class MaximumSubarray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of the array: ");
		int N = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		int result = maxSub(arr);
		System.out.println("Result: "+result);
	}

	public static int maxSub(int[] nums){
		int res = nums[0];
		int currSum = 0;
		for(int n: nums){
			currSum = Math.max(currSum,0);
			currSum+=n;
			res = Math.max(res,currSum);
		}

		return res;


	}
}