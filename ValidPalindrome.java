import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("valid: "+valid(str));
        sc.close(); 
    }
    public static boolean valid(String str){
        int i=0;
        int j = str.length();
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                j--;
                i++;
                continue;
            }else if(str.charAt(i)!= str.charAt(j)){
                return false;
            }    
        }
        return true;
    }
}
