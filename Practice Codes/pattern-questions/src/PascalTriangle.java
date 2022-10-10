import java.util.Scanner;

public class PascalTriangle {
	
	public static int factorial(int fac) {
		if(fac == 1 || fac == 0)
			return 1;
		return fac*factorial(fac-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for(int r = 0; r <= num; r++) {
			for(int sp = r; sp < num; sp++)
				System.out.print(" ");
			for(int c = 0; c <= r; c++) {
				int res = factorial(r)/(factorial(c)*factorial(r-c));
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}
}
