public class FindNonRepearDigit {
	public static void main(String[] args) {
		int arr[] = {4, 1, 5, 3, 4, 1, 5, 8};
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res ^= arr[i];
		}
		System.out.println(res);
	}
}
