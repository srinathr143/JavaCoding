import java.util.Scanner;

public class findMaxDifference{
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
		int result = maxDiff(arr);
		System.out.println("Result: "+result);
		sc.close();
	}
	public static int maxDiff(int[] arr){
		int max = arr[0];
		int min = arr[0];
		for(int num:arr){
			max = Math.max(num,max);
			min = Math.min(min,num);
		}
		return max-min;
	}

}