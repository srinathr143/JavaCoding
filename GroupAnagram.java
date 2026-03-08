import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GroupAnagram{
	public static void main(String[] args){
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagram(strs));

	}
	private static List<List<String>> groupAnagram(String[] str){
		Map<String, List<String>> map = new HashMap<>();
		for(String s: str){
			int[] count = new int[26];
			for(Character c: s.toCharArray()){
				count[c - 'a']++;
			}

			StringBuilder keys = new StringBuilder();
			for (int num:count){
				keys.append(num).append("#");
			}
			String key = keys.toString();

			if(!map.containsKey(key)){
				map.put(key,new ArrayList<>());
			}
			map.get(key).add(s);
		}

		return new ArrayList<>(map.values());
	}
}