import java.util.LinkedHashSet;

public class RearrangeString {
    public static void main(String[] args){
        System.out.println(rearrange("programming"));
    }
    private static String rearrange(String s){
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        StringBuilder unique = new StringBuilder();
        StringBuilder remaining = new StringBuilder();
        for(char c: s.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                unique.append(c);
            }
            else{
                remaining.append(c);
            }
        }
        return unique.toString() + remaining.toString();
    }
}
