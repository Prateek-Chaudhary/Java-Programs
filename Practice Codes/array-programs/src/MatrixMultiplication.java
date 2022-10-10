public class MatrixMultiplication {
	public static void main(String[] args) {
		int m1[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int m2[][] = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
		int mul[][] = new int[3][3];
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				for(int k = 0; k < 3; k++) {
					mul[r][c] += m1[r][k]*m2[k][c];
				}
			}
		}
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(mul[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of the matrix : ");
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(mul[c][r]+" ");
			}
			System.out.println();
		}
	}
}
