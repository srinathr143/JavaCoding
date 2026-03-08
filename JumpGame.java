import java.util.Scanner;

public class JumpGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array");
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		System.out.print(game(arr));
	}
	public static boolean game(int[] arr){
		int maxReach = 0;
		for(int i=0;i<=maxReach;i++){
			maxReach = Math.max(maxReach,i+arr[i]);
			if(maxReach>=arr.length-1){
				return true;
			}
		}
		return false;
	}

}