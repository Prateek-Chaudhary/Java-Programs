import java.util.Scanner;

public class CyclicRotate {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			int ref = arr[0];
			for(int i = 0; i < arr.length; i++) {
				if(i+1 != arr.length)
					arr[i] = arr[i+1];
			}
			arr[arr.length-1] = ref;
			
			for(int i : arr)
				System.out.print(i+" ");
			System.out.println("Enter any number : ");
			int num = sc.nextInt();
			if(num > 0)
				flag = true;
			else
				flag = false;
		}
	}
}
