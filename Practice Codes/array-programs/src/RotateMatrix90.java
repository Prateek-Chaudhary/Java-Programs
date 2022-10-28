public class RotateMatrix90 {
	public static void main(String[] args) {
		int[][] ar = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] res = new int[ar.length][ar.length];
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				res[j][i] = ar[ar.length-1-i][j];
			}
		}
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After the rotation at 90 degree");
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
