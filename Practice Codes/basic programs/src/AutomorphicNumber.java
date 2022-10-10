import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt(),ref = num,ref2 = num*num,len = 0;
		while(ref>0) {
			ref /= 10;
			len++;
		}
		String res = "";
		int [] arr = new int[len];
		for(int i = 0; i < len; i++) {
			arr[i] = ref2%10;
			ref2 /= 10;
		}
		for(int i = arr.length-1; i>=0; i--) {
			res += arr[i];
		}
		if(Integer.parseInt(res) == num)
			System.out.println("Number "+num+" is automorphic");
		else
			System.out.println("Number "+num+" is not automorphic");
	}
}
