public class TriangularMatrix {
	public static void main(String[] args) {
		int matrix[][] = {{0, 2, 3},{0, 1, 2},{0, 0, 1}};
		boolean flag = false;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if((c >= r && matrix[r][c] != 0) || (c < r && matrix[r][c] == 0))
					flag = true;
				else {
					flag = false;
					break;
				}
			}
			if(flag == false)
				break;
		}
		if(flag)
			System.out.println("Matrix is upper triangular matrix");
		else
			System.out.println("Matrix is not upper triangular matrix");
	}
}
