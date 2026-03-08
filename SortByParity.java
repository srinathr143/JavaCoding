import java.util.Arrays;
public class SortByParity{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		// parity(arr);
		// System.out.println(Arrays.toString(arr));
		int[] result = parity(arr);
		System.out.println(Arrays.toString(result));
	}

	private static /*void*/ int[] parity(int[] arr){
		// int left =0;
		// int right = arr.length -1;
		// while (left<right){
		// 	if(arr[left]%2 > arr[right]%2){
		// 		int temp = arr[right];
		// 		arr[right] = arr[left];
		// 		arr[left] = temp;
		// 	}
		// 	if(arr[left]%2 ==0){
		// 		left++;
		// 	}
		// 	if(arr[right]%2==1){
		// 		right--;
		// 	}
		// }

		// int left =0;
		// int right = arr.length -1;
		// while (left<right){
		// 	while(left<right && arr[left]%2==0){
		// 		left++;
		// 	}
		// 	while (left<right && arr[right]%2==1){
		// 		right--;
		// 	}
		// 	if(left<right){
		// 		int temp = arr[left];
		// 		arr[left] =arr[right];
		// 		arr[right]= temp;
		// 	}
		// }

		int[] result = new int[arr.length];
		int index=0;
		for(int num:arr){
			if(num%2==0){
				result[index]=num;
				index++;
			}
		}
		for(int num:arr){
			if(num%2!=0){
				result[index]=num;
				index++;
			}
		}
		return result;

	}
}