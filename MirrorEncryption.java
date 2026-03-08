import java.util.Scanner;

public class MirrorEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the encrypted string: ");
        String str = sc.nextLine();
        System.out.print("Decrypted String: "+decrypt(str));
        sc.close();
    }
    public static String decrypt(String str){
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()){
            if(c >= 'A' && c<= 'Z'){
                sb.append((char) ('A'+'Z'-c));
            }else if(c>='a' && c<='z'){
                sb.append((char) ('a'+'z'-c));
            }
        }
        return sb.toString();
    }
    
}
