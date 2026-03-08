import java.util.ArrayList;

public class ReorderWord{
	public static void main(String[] args){
		String s = "is1 thi0s t3est 2a";
		System.out.println(word(s));
	}
	private static String word(String s){
		String[] str = s.split(" ");
		ArrayList<String> Letter = new ArrayList<>();
		ArrayList<String> Number = new ArrayList<>();
		
		for(String value: str){
			String letter = "";
			String number = "";
			for(char c: value.toCharArray()){
				if(Character.isDigit(c)){
				number+=c;
				}
				else{
					letter+=c;
				}
			}
			Letter.add(letter);
			Number.add(number);
		}
		String result ="";
		for(int i=0;i<Number.size();i++){
			int index = Integer.parseInt(Number.get(i));
			result+=Letter.get(index)+" ";
		}
		return result;
	}

	
}