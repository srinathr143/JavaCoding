import java.util.Scanner;

public class MajorityElements{
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
		System.out.print("Majority Element: "+ majEle(arr));
	}
	public static int majEle(int[] arr){
		int maj = arr[0];
		int votes = 1;
		for(int i=1;i<arr.length;i++){
			if(votes == 0){
				maj = arr[i];
				votes++;
			}
			else if(maj == arr[i]){
				votes++;
			}
			else votes--;
		}
		return maj;
	}
}