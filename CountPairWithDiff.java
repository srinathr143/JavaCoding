import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountPairWithDiff{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of the array: ");
		int n = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] =sc.nextInt();
		}
		sc.nextLine();

		System.out.print("Enter the target value: \\n");
		int k = sc.nextInt();
		sc.nextLine();
		System.out.println("Count: "+ countPair(arr,k));
		sc.close();
	}
	public static int countPair(int[] arr,int k){
		Map<Integer,Integer> map = new HashMap<>();
		for(int n:arr){
			map.put(n, map.getOrDefault(n,0)+1);
		}
		int count = 0;
		for(int n: map.keySet()){
			int target = n+k;
			if(map.containsKey(target)){
				count += map.get(n) * map.get(target);
			}
		}
		return count;
	}
}