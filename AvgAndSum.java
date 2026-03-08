import java.util.Scanner;

class AvgAndSum{
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
		avgSum(arr);
		sc.close();
	}
	public static void avgSum(int[] arr){
		int sum=0;
		for(int r: arr){
			sum+=r;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/arr.length);
	}
}