public class MatrixSum {
	public static void main(String[] args) {
		int m1[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int m2[][] = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
		int sum[][] = new int[3][3];
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				sum[r][c] = m1[r][c] + m2[r][c];
			}
		}
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(sum[r][c]+" ");
			}
			System.out.println();
		}
	}
}
