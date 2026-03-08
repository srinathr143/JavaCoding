/*given an array of 0s and 1s find the longest subarray that contains an equal number of 0s and 1s

find longest continous sequence of 0s and 1s */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestBalancedSubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Subarray Length: "+ subarrayLen(arr));
        sc.close();
    }
    public static int subarrayLen(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLen = 0;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]==0?-1:1);
            if(map.containsKey(sum)){
                int length = i - map.get(sum);
                maxLen = Math.max(maxLen,length);
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
    
}
