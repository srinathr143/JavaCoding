import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;	

public class PrintUnique{
	public static void main(String[] args){
		int[] nums = {1, 3, 3, 4, 2, 2, 5, 1, 6};
        uniqueElements(nums);
        duplicate(nums);
	}
	private static void uniqueElements(int[] arr){
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i:arr){
			set.add(i);
		}
		System.out.print(Arrays.toString(set.toArray()));
	}

	private static void duplicate(int arr[]){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num :arr){
			map.put(num,map.getOrDefault(num,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry : map.entrySet()){
			if(entry.getValue() >= 2){
				System.out.println(entry.getKey()+ " :"+ entry.getValue());
			}
		}
	}
}