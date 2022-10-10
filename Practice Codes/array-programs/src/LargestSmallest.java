import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array :");
		int len = sc.nextInt();
		int ar[] = new int[len];
		System.out.println("Enter the elements of the array :");
		for(int i = 0; i < len; i++) {
			System.out.print("Enter element-"+(i+1)+" : ");
			ar[i] = sc.nextInt();
		}
		int smaller = ar[0], larger = ar[0];
		for(int i = 1; i < ar.length; i++) {
			if(smaller>ar[i])
				smaller = ar[i];
			if(larger < ar[i])
				larger = ar[i];
		}
		System.out.println("Smallest number in the array is : "+smaller);
		System.out.println("Larger number in the array is : "+larger);
	}
}
