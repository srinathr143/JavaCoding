import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement{
	public static void main(String[] args){
		String s = "srinath";
		frequency(s);

	}
	private static void frequency(String s){
		s.toLowerCase();
		Map<Character,Integer> map = new HashMap<>();
		for(char c: s.toCharArray()){
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character,Integer> c: map.entrySet()){
			System.out.println(c.getKey()  + " -> "+ c.getValue());
		}
	}
}