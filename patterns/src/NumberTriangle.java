public class NumberTriangle {
	public static void main(String[] args) {
		int num=7;
		for(int i=0;i<=6;i++) {
			for(int j=num-1;j<=6;j++) {
				if(j==6)
					num--;
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
}
