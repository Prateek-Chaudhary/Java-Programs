public class SecondLargest {
	public static void main(String[] args) {
		int ar[] = {50, 20, 30, 70, 45, 10, 40};
		int largest = ar[0], secondLargest = ar[0], third = 0;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] > largest)
				largest = ar[i];
			if(ar[i] < largest && ar[i] > secondLargest)
				secondLargest = ar[i];
			if(ar[i] < secondLargest && ar[i] > third)
				third = ar[i];
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		System.out.println(third);
	}
}
