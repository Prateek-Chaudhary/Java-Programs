public class SparseMatrix {
	public static void main(String[] args) {
		int sparse[][] = {{1, 0, 1},{0, 0, 6},{0, 4, 0}};
		int zero = 0, non = 0;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(sparse[r][c] == 0)
					++zero;
				else
					++non;
			}
		}
		if(zero > non)
			System.out.println("Matrix is sparse matrix");
		else
			System.out.println("Matrix is not a sparse matrix");
	}
}
