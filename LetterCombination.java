import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    private static final Map<Character,String> map = new HashMap<>();

    static {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tvu");
        map.put('9',"wxyz");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String input = sc.nextLine();
        List<String> result = letterCombination(input);
        System.out.println(Arrays.toString(result.toArray()));
        sc.close();
    }
    public static List<String> letterCombination(String s){
        List<String> result = new ArrayList<>();
        if(s.isEmpty()) return result;
        dfs(s,0,new StringBuilder(),result);
        return result;
    }
    private static void dfs(String s, int i, StringBuilder sb, List<String> result){
        if(i == s.length()) {
            result.add(sb.toString());
            return;
        }
        String letters = map.get(s.charAt(i));
        if(letters == null) return;
        for(char c: letters.toCharArray()){
            sb.append(c);
            dfs(s,i+1,sb,result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}
