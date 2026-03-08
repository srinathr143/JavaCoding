import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class GroceryAnalyzer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[][] groceryList = new String[n][3];
		for(int i=0;i<n;i++){
			System.out.print("Name: ");
			groceryList[i][0] = sc.nextLine();

			System.out.print("Price per Unit: ");
			groceryList[i][1] = sc.nextLine();

			System.out.print("Quantity sold: ");
			groceryList[i][2] = sc.nextLine();
		}
		for(String[] str: groceryList){
			System.out.print(Arrays.toString(str));
		}
		analyseGrocery(groceryList);
	}
	public static void analyseGrocery(String[][] str){
		Map<String,Double> map = new HashMap<>();
		for(String[] item: str){
			String name = item[0];
			double price = Double.parseDouble(item[1]);
			int quantity = Integer.parseInt(item[2]);
			map.merge(name,price*quantity, Double::sum);
		}

		String maxItem = null;
		double maxPrice = Double.MIN_VALUE;
		double totalRevenue = 0;
		for(Map.Entry<String, Double> entry: map.entrySet()){
			totalRevenue +=entry.getValue();
			if(entry.getValue() > maxPrice){
				maxPrice = entry.getValue();
				maxItem = entry.getKey();
			}
		}
		System.out.println(maxItem);
		System.out.println(maxPrice);
		System.out.println((int) (totalRevenue/str.length));
	}
}