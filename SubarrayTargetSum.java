/* given an array of integers and target sum find all the subarrays within the array that sum to target value, 
a subarray is defined as a contiguous sequence of elements within the array*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class SubarrayTargetSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int N = sc.nextInt();
		sc.nextLine();
		System.out.print("enter the target value: ");
		int target = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		List<int[]> result = subarrayTarget(arr, target);
		for(int[] sub :result){
			System.out.print(Arrays.toString(sub));
		}
		
	}
	public static List<int[]> subarrayTarget(int[] arr,int target){
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j =i;j<arr.length;j++){
				sum+=arr[j];
				if(sum== target){
					int[] subArray = Arrays.copyOfRange	(arr,i, j+1);
					list.add(subArray);
				}
			}
		}
		return list;
	}
}