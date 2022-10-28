public class TriangleAreaUsingCoordinates {
	public static void main(String[] args) {
		int[][] ar = {{0,0},{0,2},{2,0}};
		int[] x = new int[3];
		int[] y = new int[3];
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0)
					x[i] = ar[i][0];
				else
					y[i] = ar[i][1];
			}
		}
		for(int i : x)
			System.out.print(i+" ");
		System.out.println();
		for(int j : y)
			System.out.print(j+" ");
	}
}
