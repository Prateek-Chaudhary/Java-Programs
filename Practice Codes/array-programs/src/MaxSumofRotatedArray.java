public class MaxSumofRotatedArray {
	
	public static int maxSumRotate(int[] ar, int n) {
		int maxSum = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < ar.length; j++) {
				sum += ar[j]*j;
			}
			if(maxSum < sum)
				maxSum = sum;
			int temp = ar[0];
			for(int j = 0; j< ar.length-1; j++) {
				ar[j] = ar[j + 1];
			}
			ar[ar.length-1] = temp;
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] ar = {8, 2, 3, 1};
		int n = ar.length;
		System.out.println(maxSumRotate(ar, n));
	}
}
