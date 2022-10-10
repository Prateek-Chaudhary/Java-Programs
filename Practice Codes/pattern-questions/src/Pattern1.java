public class Pattern1 {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = i+1; j <= 2*i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
