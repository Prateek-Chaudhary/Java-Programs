import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of the fibonacci series");
		n=sc.nextInt();
		System.out.print(a+", "+b);
		for(int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(", "+c);
		}
	}
}
