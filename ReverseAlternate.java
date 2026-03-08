public class ReverseAlternate {
    public static void main(String[] args){
        String s = "Java is the Best Programming Language";
        reverse(s);
    }
    private static void reverse(String s){
        String[] str = s.split(" ");
        String output = "";
        for(int i=0;i<str.length;i++){
            if(i%2 ==0){
                output+=str[i]+" ";
            }
            else{
                String temp = str[i];
                String rev = "";
                for(int j=temp.length()-1;j>=0;j--){
                    rev+=temp.charAt(j);
                }
                output+=rev+" ";
            }
        }
        System.out.println(output);
    }
}
