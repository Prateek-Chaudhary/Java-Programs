public class IdentityMatrix {
	public static void main(String[] args) {
		int identity[][] = {{1, 0, 0},{0, 1, 0},{0, 0, 1}};
		boolean b = false;
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if((r == c && identity[r][c] == 1) || (r != c && identity[r][c] == 0)) {
					b = true;
				}
				else {
					b = false;
					break;
				}
			}
			if(b == false)
				break;
		}
		if(b)
			System.out.println("Matrix is identity");
		else
			System.out.println("Matrix is not identity");
	}
}
