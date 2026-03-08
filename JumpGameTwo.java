import java.util.Scanner;
public class JumpGameTwo{
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
		int jumps = jump(arr);
		System.out.print("Jumps: "+jumps);
	}
	public static int jump(int[] arr){
		int jumps = 0;
		int end =0;
		int far = 0;
		for(int i=0;i<arr.length-1;i++){
			far = Math.max(far, i+arr[i]);
			if(end == i){
				jumps++;
				end = far;
			}
		}
		return jumps;
	}
}