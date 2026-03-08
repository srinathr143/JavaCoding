public class SumOfDigits {
    public static void main(String[] args){
        int num = 12345;
        System.out.println(sumDigits(num));
    }
    private static int sumDigits(int num){
        int sum =0;
        while(num>0){
            int temp = num%10;
            sum+=temp;
            num/=10;
        }
        return sum;
    }
}
