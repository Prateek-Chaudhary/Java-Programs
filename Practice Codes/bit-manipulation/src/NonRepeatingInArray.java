public class NonRepeatingInArray {
	public static void main(String[] args) {
		int[] ar = {1, 3, 4, 9, 4, 1, 5, 7, 3, 7, 9};
		int val = 0;
		for(int i = 0; i < ar.length; i++) {
			val = val^ar[i];
		}
		System.out.println(val);
	}
}
