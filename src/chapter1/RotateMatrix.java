package chapter1;

public class RotateMatrix {

	public static void main(String[] args) {
		float[][] a = { { 1, 2,3,4}, { 5,6,7,8 },{9,10,11,12} };
		printMatrix(rotateMatrix(a));
	}

	public static float[][] rotateMatrix(float[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		float[][] newMatrix = new float[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				newMatrix[j][i] = matrix[i][cols - j - 1];
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
