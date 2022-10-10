public class RowSum {
	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		for(int r = 0; r < 3; r++) {
			int sum = 0;
			for(int c = 0; c < 3; c++) {
				sum += matrix[r][c]; 
			}
			System.out.println("Sum of row :"+r+" is : "+sum);
		}
	}
}
