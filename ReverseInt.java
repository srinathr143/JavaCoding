public class ReverseInt{
	public static void main(String[] args){
		int a = 1234;
		System.out.println(reverseInt(a));

	}
	private static int reverseInt(int n){
		int rev=0;
		while (n!=0){
			int digit = n%10;
			rev = rev*10 +digit;
			n = n/10;
		}
		return rev;
	}
}