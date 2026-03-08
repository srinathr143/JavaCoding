import java.util.*;
public class twosum{
	public static void main(String[] args){
		int[] num = {1, 1, 1, 1};
		int target = 2;
		int[] result = indices(num,target);
		System.out.print(result);

	}

	private static int[] indices(int[] arr, int target){
		// for(int i=0;i<arr.length;i++){
		// 	for(int j=i+1;j<arr.length;j++){
		// 		if((arr[i] + arr[j]) == target){
		// 			return new int[]{i,j};
		// 		}
		// 	}
		// }
		// return new int[]{};

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0;i<arr.length;i++){
			int complement = target - arr[i];
			if(map.containsKey(complement))
				return new int[] {map.get(complement),i};
			else{
				map.put(arr[i],i);
			}
		}
		return new int[] {};

		
	}
}