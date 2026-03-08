import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of A: ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the value of B: ");
		int b = sc.nextInt();
		sc.nextLine();
		List<Integer> list = new ArrayList<>();
		for(int i=a;i<=b;i++){
			if(isPal(i)){
				list.add(i);
			}
		}
		System.out.println(Arrays.toString(list.toArray()));
		sc.close();
	}
	public static boolean isPal(int a){
		if(a <0 ) return false;
		int original = a;
		int reversed = 0;
		while(a!=0){
			reversed = reversed*10 + a%10;
			a/=10;
		}
		return reversed == original;
	}
}

