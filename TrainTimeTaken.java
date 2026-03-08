import java.util.Scanner;

public class TrainTimeTaken{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Speed of the train: ");
		double speed = sc.nextDouble();
		sc.nextLine();
		int lenOfBridgeinMeters = 400;
		int lenOfTraininMeters = 400;
		double result = timeTaken(speed,lenOfTraininMeters,lenOfBridgeinMeters);
		System.out.print("Time Taken: "+ (int) result + " seconds");
		sc.close();
	}
	public static double timeTaken(double speed, int lenOfTraininMeters, int lenOfBridgeinMeters){
		double speedInMeterPerSec = speed * (5.0 / 18.0);
		return (lenOfTraininMeters+lenOfBridgeinMeters) / speedInMeterPerSec;
	}
}