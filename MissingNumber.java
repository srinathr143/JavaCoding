public class MissingNumber{
	public static void main(String[] args){
		int[] num = {1,2,4,5};
		System.out.println(result(num));
		int[] test = {3,0,1};
		System.out.println(result(test));
 
	}
	private static int result(int[] arr){
		// int max = 0;
		// for(int num:arr){
		// 	if(num > max){
		// 		max = num;
		// 	}
		// }
		// int sum = max*(max+1)/2;
		// int asum = 0;
		// for(int n:arr){
		// 	asum+=n;
		// }
		// return sum - asum;
		int n = arr.length+1;
		int xor = 0;
		for(int i=0;i<n;i++){
			xor ^= i ^ (i < arr.length ? arr[i] : 0);
		}
		return xor;
	}
}