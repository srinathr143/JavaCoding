import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParanthesis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> result = generatePara(n);
        System.out.println(Arrays.toString(result.toArray()));
        sc.close();
    }
    public static List<String> generatePara(int n){
        List<String> result = new ArrayList<>();
        backtrack(n,n,new StringBuilder(),result);
        return result;
    }
    private static void backtrack(int left, int right, StringBuilder sb,List<String> result){
        if(left==0 && right==0){
            result.add(sb.toString());
            return;
        }
        if(left >0){
            sb.append('(');
            backtrack(left-1, right, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }
        if(left <right){
            sb.append(')');
            backtrack(left, right-1, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
