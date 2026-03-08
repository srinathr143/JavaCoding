import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumPair {
    public static void main(String[] args){
        int[] arr = {8,1,6,4,3,7,9,8,2,5,0,10};
        int target = 7;
        List<List<Integer>> result = pair(arr,target);
        System.out.println(Arrays.toString(result.toArray()));
    }
    private static List<List<Integer>> pair(int[] arr, int target){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    list.add(pair);
                }
            }
        }
        return list;
    }
}
