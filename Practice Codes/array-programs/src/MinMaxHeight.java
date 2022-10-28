public class MinMaxHeight {
	public static void main(String[] args) {
		int[] arr = {1, 4, 7, 9, 6, 5};
		int h = 3;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]-h < 1) {
				arr[i] += h;
			}
			else {
				arr[i] -= h;
			}
		}
		int min = arr[0], max = arr[0];
		for(int i : arr) {
			if(min > i)
				min = i;
			if(max < i)
				max = i;
		}
		System.out.println("Difference of their height is : "+(max-min));
	}
}
