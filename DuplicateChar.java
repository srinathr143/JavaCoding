import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateChar{
	public static void main(String[] args){
		String s = "SwathiSrinath";
		duplicateElement(s);

	}
	private static void duplicateElement(String s){
		String[] str = s.toLowerCase().split("");
		LinkedHashSet<String> set= new LinkedHashSet<>(Arrays.asList(str));
		str = new String[] {String.join("",set)};
		System.out.println(Arrays.toString(str));
 	}
}