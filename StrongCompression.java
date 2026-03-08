import java.util.Arrays;
public class StrongCompression{
	public static void main(String[] args){
		String s = "aaaabbcdddeeeee";
		compress(s);
	}
	private static void compress(String s){
		String[] str = s.toLowerCase().split("");
		System.out.println(Arrays.toString(str));
		int count =1;
		String com = "";
		for (int i=0;i<s.length();i++){
			if(s.length() >i+1 && str[i].equals(str[i+1])){
				count++;
			}
			else{
				com = com+str[i]+count;
				count=1;
			}
		}
		System.out.println(com);
	}
}