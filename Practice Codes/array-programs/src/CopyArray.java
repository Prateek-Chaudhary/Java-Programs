public class CopyArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int arr2[] = arr.clone();
		for(int i:arr2) {
			System.out.println(i);
		}
		System.out.println(arr.getClass().getName());
	}
}
