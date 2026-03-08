public class CountVowelsAndConsonants{
	public static void main(String[] args){
		String name = "Srinath";
		System.out.println(countVowels(name));
		System.out.println(countConsonants(name));

	}
	private static int countVowels(String name){
		name = name.toLowerCase();
		int count = 0;
		for (Character c: name.toCharArray()){
			if ("aeiou".indexOf(c) != -1){
				count++;			}
		}
		return count;
	}
	private static int countConsonants(String name){
		name = name.toLowerCase();
		int count = 0;
		for (Character c: name.toCharArray()){
			if ("aeiou".indexOf(c) == -1){
				count++;			
			}
		}
		return count;
	}
}