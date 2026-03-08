import java.util.Arrays;
public class LeftRotateArray{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		int k = 2;
		leftRotate(arr,k);
		System.out.println(Arrays.toString(arr));

	}
	private static void leftRotate(int[] arr, int k){
		int n = arr.length;
		k = k%n;

		int[] temp = new int[n];
		int index =0;
		for(int i=k;i<n;i++){
			temp[index++]= arr[i];
		}
		for(int i=0;i<k;i++){
			temp[index++]=arr[i];
		}
		for(int i=0;i<n;i++){
			arr[i] =temp[i];
		}
	}
}