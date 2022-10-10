import java.util.Scanner;

public class JaggedMatrix {
	public static void main(String[] args) {
		int matrix[][] = new int[3][];
		matrix[0] = new int[3];
		matrix[1] = new int[2];
		matrix[2] = new int[1];
		Scanner sc = new Scanner(System.in);
		for(int r = 0; r < matrix.length; r++) {
			for(int c = 0; c < matrix[r].length; c++)
				matrix[r][c] = sc.nextInt();
		}
		for(int r = 0; r < matrix.length; r++) {
			for(int c = 0; c < matrix[r].length; c++)
				System.out.print(matrix[r][c]+" ");
			System.out.println();
		}
	}
}
