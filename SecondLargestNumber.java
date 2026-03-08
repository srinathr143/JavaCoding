import java.util.Arrays;
public class SecondLargestNumber{
	public static void main(String[] args){
		int[][] tests = {{12,35,1,10,34,1}, {10,5,10}, {5,5,5}};
		for(int[] test : tests) {
		    System.out.println(Arrays.toString(test) + " → " + secondLargest(test));
		}

	}
	private static int secondLargest(int[] nums){

		if(nums.length <2){
			return -1;
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i=0;i<nums.length;i++){
			if(nums[i]>largest){
				secondLargest = largest;
				largest = nums[i];
			}
			else if(nums[i] > secondLargest && nums[i] != largest){
				secondLargest = nums[i];
			}
		}
		return (secondLargest == Integer.MIN_VALUE) ? -1: secondLargest;
	}
}