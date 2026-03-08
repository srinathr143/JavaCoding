import java.util.Scanner;

class PivotIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        sc.nextLine();
        System.out.print("Pivot Index: "+pivotIndex(arr));
    }
    public static int pivotIndex(int[] arr){
        int left = 0;
        int right = 0;
        for(int num: arr){
            right+=num;
        }
        for(int i=0;i<arr.length;i++){
            right -=arr[i];
            if(left == right){
                return i;
            }
            else{
                left += arr[i];
            }
        }
        return -1;
    }
}