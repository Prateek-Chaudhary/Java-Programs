public class MinimumJump {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int jump = 0;
		int inc = 0;
		while(inc <= arr.length) {
			inc += arr[inc];
			jump++;
		}
		System.out.println(jump);
	}
}
