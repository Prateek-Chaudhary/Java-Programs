public class MatrixEvenOddFrequency {
	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int odd = 0,even = 0;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(matrix[r][c] % 2 == 0)
					even++;
				else
					odd++;
			}
		}
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(matrix[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("Frequency of even numbers in the matrix are : "+even);
		System.out.println("Frequency of odd numbers in the matrix are : "+odd);
	}
}
