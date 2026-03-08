import java.util.Arrays;
import java.util.Comparator;

public class SortByAbsoluteDiff{
	public static void main(String[] args){
		int[] arr ={1, 2, 3, 4, 5, 6};
		int k=3;
		AbsoulteDiff(arr,k);
		System.out.print(Arrays.toString(arr));
	}
	private static void AbsoulteDiff(int[] arr, int k){
		Integer[] box = new Integer[arr.length];

		for(int i=0; i<arr.length;i++){
			box[i] = arr[i];
		}

		Arrays.sort(box, new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b){
				return Math.abs(a-k) - Math.abs(b-k);
			}
		});


		for(int i=0;i<arr.length;i++){
			arr[i] = box[i];
		}

 	}
}