public class StringDecompression{
	public static void main(String[] args){
		String s = "a3b2c1d3e5";
		StringBuilder result = decompress(s);
		System.out.println(result);

	}
	private static StringBuilder decompress(String s){
		StringBuilder res = new StringBuilder();
		for(int i=0;i<s.length();i++){
			char value = s.charAt(i);
			if(Character.isDigit(value)){
				for(int j=0;j<Integer.parseInt(String.valueOf(value));j++){
					res.append(s.charAt(i-1));
				}
			}
		}
		return res;
	}
}