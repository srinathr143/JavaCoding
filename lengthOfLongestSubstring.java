import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring{
	public static void main(String[] args){
		String strs = "abcabcbb";
		System.out.println(longestSubString(strs));
	}
	private static int longestSubString(String strs){
		Set<Character> set = new HashSet<>();
		int left =0;
		int maxLen =0;
		for (int right=0;right<strs.length();right++){
			while(set.contains(strs.charAt(right))){
				set.remove(strs.charAt(left));
				left++;
			}
			set.add(strs.charAt(right));
			maxLen = Math.max(maxLen,right-left+1);
		}
		return maxLen;
	}
}