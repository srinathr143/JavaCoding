import java.util.Scanner;
import java.util.Arrays;

public class MaxEfficiencyProduct{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of the array: ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
		sc.nextLine();
		System.out.print("Result: "+efficiency(arr));
	}
	public static long efficiency(int[] arr){
		if(arr.length < 3) return 0;
		Arrays.sort(arr);
		long p1 = (long) arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
		long p2 = (long)arr[0]*arr[1]*arr[arr.length-1];
		return Math.max(p1,p2);
	}
}