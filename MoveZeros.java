import java.util.Arrays;
public class MoveZeros{
	public static void main(String[] args){
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
	private static void moveZeroes(int[] arr){
		int nonZeroIndex = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0){
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex++;
			}
		}
		while (nonZeroIndex< arr.length){
			arr[nonZeroIndex++] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}