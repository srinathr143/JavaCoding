import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ShoePairs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s = sc.nextLine();
		int count = pairCount(s);
		System.out.print("Pair Count: "+count);
	}
	public static int pairCount(String s){
		Map<Integer, int[]> map = new HashMap<>();
		for(int i=0;i<s.length();i+=2){
			int size = Character.getNumericValue(s.charAt(i));
			char side = s.charAt(i+1);

			map.putIfAbsent(size, new int[]{0,0});
			if(side == 'L'){
				map.get(size)[0]++;
			}
			else{
				map.get(size)[1]++;
			}
		}
		int totalPairs = 0;
		for(int[] n: map.values()){
			totalPairs+=Math.min(n[0],n[1]);
		}
		return totalPairs;
	}
}