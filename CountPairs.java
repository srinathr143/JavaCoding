import java.util.*;
public class CountPairs{
	public static void main(String[] args){
		int[] num = {1, 5, 7, -1, 5};
		int target = 6;
		System.out.println(count(num,target));

	}
	private static int count(int[] nums, int target){
		// int count = 0;
		// for(int i=0;i<nums.length;i++){
		// 	for(int j=i+1;j<nums.length;j++){
		// 		if(nums[i]+nums[j] == target){
		// 			count++;
		// 		}
		// 	}
		// }
		// return count;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int num: nums){
			int complement = target -num;

			if(map.containsKey(complement)){
				count += map.get(complement);
			}
			else{
				map.put(num,map.getOrDefault(num,0)+1);
			}
		}
		return count;
	}
}