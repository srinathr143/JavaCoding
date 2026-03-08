import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class isIsomorphic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String: ");
		String s = sc.nextLine();
		System.out.print("enter the String: ");
		String t = sc.nextLine();
		System.out.print(isomorphic(s,t));
	}
	public static boolean isomorphic(String s, String t){
		if(s.length()!=t.length()) return false;

		Map<Character, Character> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			char stc = s.charAt(i);
			char tsc = t.charAt(i);

			if(map.containsKey(stc)){
				if(map.get(stc)!= tsc) return false;
			}
			else{
				if(map.containsValue(tsc)) return false;
				map.put(stc,tsc);
			}
		}
		return true;
	}
}