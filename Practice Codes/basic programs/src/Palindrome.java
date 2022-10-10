import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int ref = num;
		String val="";
		while(ref>0) {
			val += ref % 10;
			ref /= 10;
		}
		if(Integer.parseInt(val) == num)
			System.out.println("Number "+num+" is palindrome");
		else
			System.out.println("Number "+num+" is not palindrome");
	}
}
