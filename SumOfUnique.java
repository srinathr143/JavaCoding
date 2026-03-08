import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class SumOfUnique{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int N = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		int result = sumofUniqueEle(arr);
		System.out.println("Result: "+result);
	}

	public static int sumofUniqueEle(int[] arr){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.getOrDefault(arr[i],0)+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		int sum = 0;
		for(Map.Entry<Integer,Integer> entry: map.entrySet()){
			if(entry.getValue()==1){
				sum+=entry.getKey();
			}
		}
		return sum;
	}
}