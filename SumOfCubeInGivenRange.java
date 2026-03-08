import java.util.Scanner;

public class SumOfCubeInGivenRange{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of n: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("enter the value of m: ");
		int m = sc.nextInt();
		sc.nextLine();
		long result = sumOfCube(n,m);
		System.out.print("Result: "+result);

	}
	public static long sumOfCube(int n , int m){
		// int sum=0;
		// for(int i=n;i<=m;i++){
		// 	sum+=i*i*i;
		// }
		// return sum;
		if(n>m) return 0;
		if(n<1) n=1;
		return cubeSum(m) - cubeSum(n-1);
	}

	public static long cubeSum(long k){
		if(k<1) return 0;
		long result = k*(k+1)/2;
		return result*result;
	}

}