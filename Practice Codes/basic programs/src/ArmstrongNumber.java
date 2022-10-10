import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt(),n=num,res=0;
		while(n>0) {
			res += Math.pow(n%10, 3);
			n /= 10;
		}
		if(res == num)
			System.out.println("Number "+num+" is armstrong");
		else
			System.out.println("Number "+num+" is not armstrong");
	}
}
