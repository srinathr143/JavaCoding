import java.util.ArrayList;
public class isPrime{
	public static void main(String[] args){
		int num = 8;
		//long startTime = System.nanoTime();
		System.out.println(prime(num));
		//long endTime = System.nanoTime();
		//System.out.println(endTime - startTime);
		int start = 10;
		int end = 50;
		primeRange(start,end);
	}
	private static boolean prime(int n){
		if(n<=1) return false;
		if(n==2) return true;
		if(n%2 ==0) return false;
		ArrayList<Integer> list = new ArrayList<>(); 
		for(int i=3;i*i<=n;i+=2){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}

	private static void primeRange(int start, int end){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =start;i<=end;i++){
			if(prime(i)){
				list.add(i);
			}
		}
		System.out.println(list);
	}
}