public class MissingNumber {
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20};
		for(int i = 0; i < ar.length; i++)
			System.out.print(ar[i]+" ");
		System.out.println();
		for(int i = 0; i < ar.length; i++) {
			if(i < ar.length-1 && ar[i+1] - ar[i] > 1)
				System.out.println(ar[i+1]-1);
		}
	}
}
