import java.util.Arrays;
public class MatrixAddition{
	public static void main(String[] args){
		int[][] A = { {1, 2, 3}, {4, 5, 6} }; 
		int[][] B = { {7, 8, 9}, {1, 2, 3} };

		int[][] result = matrixAddition(A,B);
		for(int[] row:result){
			System.out.println(Arrays.toString(row));
		}
	}
	private static int[][] matrixAddition(int[][] a, int[][] b){
		int row = a.length;
		int column = a[0].length;

		int[][] sum = new int[row][column];

		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				sum[i][j] = a[i][j]+ b[i][j];
			}
		}
		return sum;
	}
}