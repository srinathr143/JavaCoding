import java.util.Arrays;
public class MatrixTranspose{
	public static void main(String[] args){
		int[][] A = { {1, 2, 3}, {4, 5, 6} }; 
		int[][] result = matrixTranspose(A);
		for(int[] rows :result){
			System.out.println(Arrays.toString(rows));
		}

	}
	private static int[][] matrixTranspose(int[][] a){
		int rows = a.length;
		int columns = a[0].length;

		int[][] transposed = new int[columns][rows];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				transposed[j][i] = a[i][j];
			}
		} 
		return transposed;
	}
}