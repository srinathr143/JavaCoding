import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ThreeSum{
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
		List<List<Integer>> result = threeSum(arr);
		for(List<Integer> l: result){
			System.out.println(Arrays.toString(l.toArray()));
		}
	}
	public static List<List<Integer>> threeSum(int[] arr){
		if (arr == null || arr.length <3){
			return new ArrayList<>();
		}
		Arrays.sort(arr);
		Set<List<Integer>> result = new HashSet<>();
		for(int i=0;i<arr.length-2;i++){
			int j=i+1;
			int k = arr.length-1;
			while(j<k){
				int sum = arr[i] + arr[j] +arr[k];
				if(sum == 0){
					result.add(Arrays.asList(arr[i],arr[j],arr[k]));
					j++;
					k--;
				}
				else if(sum >0){
					k--;
				}
				else{
					j++;
				}
			}
		}
		return new ArrayList<>(result);
	}

}