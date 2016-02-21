package chapter1;

import java.util.Arrays;

public class ZeroMatrix {

	public static void main(String[] args) {
		float[][] a = { { 1, 0, 3 }, { 4, 5, 6 } };
		printMatrix(zeroMatrix(a));
	}

	public static float[][] zeroMatrix(float[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		float[][] newMatrix = new float[rows][cols];
		for (int i = 0; i < rows; i++)
			newMatrix[i] = Arrays.copyOf(matrix[i], cols);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					for (int row = 0; row < rows; row++)
						newMatrix[row][j] = 0;
					for (int col = 0; col < cols; col++)
						newMatrix[i][col] = 0;
				}
			}
		}
		return newMatrix;
	}

	/**
	 * Method printing passed matrix to console.
	 * 
	 * @param matrixToPrint
	 *            matrix to print.
	 */
	public static void printMatrix(float[][] matrixToPrint) {
		for (int i = 0; i < matrixToPrint.length; i++) {
			for (int j = 0; j < matrixToPrint[1].length; j++) {
				System.out.print(matrixToPrint[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
