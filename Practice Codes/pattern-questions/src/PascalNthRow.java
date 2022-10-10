import java.util.Scanner;

public class PascalNthRow {

	public static int factorial(int fac) {
		if(fac == 1 || fac == 0)
			return 1;
		return fac*factorial(fac-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row number : ");
		int r = sc.nextInt();
		for(int c = 0; c <= r; c++) {
			System.out.print(factorial(r)/(factorial(c)*factorial(r-c))+" ");
		}
	}
}
