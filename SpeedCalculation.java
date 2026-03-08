import java.util.Scanner;
public class SpeedCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the time in Seconds; ");
		int s = sc.nextInt();
		sc.nextLine();
		speed(s);
	}

	public static void speed(int sp){
		double s = (1000/sp)*3.6;
		System.out.print("Speed: "+(int)s+"km/hr");
	}
}