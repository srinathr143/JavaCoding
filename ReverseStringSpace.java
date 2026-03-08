import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringSpace {
    public static void main(String[] args){
        String name = "Hi My name is Srinath";
        reverseSpace(name);
    }
    private static void reverseSpace(String s){
        String[] str = s.split("");
        ArrayList<Integer> space = new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(str[i].equals(" ")){
                space.add(i);
            }
        }
        System.out.println(space);
        String rev= "";
        for(int i=str.length-1;i>=0;i--){
            rev+=str[i];
        }
        rev = rev.replaceAll(" ","");
        String[] reversed = rev.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(reversed));
        System.out.println(list);
        for(int n: space){
            list.add(n," ");
        }
        System.out.println(String.join("",list));
    }
}
