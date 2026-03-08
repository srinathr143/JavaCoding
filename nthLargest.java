import java.util.PriorityQueue;
public class nthLargest{
	public static void main(String[] args){
		int[] arr = {3, 2, 1, 5, 6, 4};
		int n = 3;
		System.out.println(nthL(arr,n));

	}
	private static int nthL(int[] arr, int n){
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for (int num : arr){
			minHeap.offer(num);
			System.out.println(minHeap);

			if(minHeap.size() > n){
				minHeap.poll();
				System.out.println(minHeap);
			}
		}
		return minHeap.peek();


	}
}