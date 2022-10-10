public class EqualMatrices {
	public static void main(String[] args) {
		int m1[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int m2[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		boolean flag = false;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(m1[r][c] == m2[r][c])
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
			System.out.println("Matrices are equal");
		else
			System.out.println("are not equal");
	}
}
