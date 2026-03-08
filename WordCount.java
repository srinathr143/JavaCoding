import java.util.HashMap;
import java.util.Map;

public class WordCount{
    public static void main(String[] args){
        word("Iam srinath, and iam pursuing software development");
    }
    private static void word(String s){
        String[] str = s.toLowerCase().split(" ");
        Map<String,Integer> map = new HashMap<>();
        for(String value: str){
            if(!map.containsKey(value)){
                map.put(value,map.getOrDefault(value,0)+1);
            }
            else{
                map.put(value,map.get(value)+1);
            }
        }
        System.out.println(map);
    }
}