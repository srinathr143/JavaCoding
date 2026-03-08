import java.math.BigInteger;
public class Fibonacci{
	private static BigInteger[] nthFib;
	public static void main(String[] args){
		int n = 27;
		nthFib = new BigInteger[n+1];
		System.out.println(fib(n));

		System.out.println(fib(n));
	} 

	// private static BigInteger sumOfFib(int n){
	// 	BigInteger sum=BigInteger.ZERO;
	// 	for(int i=0;i<=n;i++){
	// 		sum = sum.add(fib(i));
	// 	}
	// 	return sum;
	// } 

	private static BigInteger fib(int n){
		if(n==0) return BigInteger.ZERO;
		if (n==1) return BigInteger.ONE;
		if(nthFib[n] != null){
			return nthFib[n];
		}
		BigInteger nfib = (fib(n-1).add(fib(n-2)));
		nthFib[n] = nfib;
		return nfib;
	}
}