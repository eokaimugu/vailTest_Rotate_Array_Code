package arraysExamples;

public class ArrayRotationReversalMethod {

	static void reverse(int[] a, int j, int k) {
		while (j < k) {
			int temp = a[j];
			a[j] = a[k];
			a[k] = temp;
			j++;
			k--;
		}
	}

	static void rotate(int[] a, int k) {
		k = k % a.length;

		if (k < 0) {
			k = k + a.length;
		}
		reverse(a, 0, k - 1);
		reverse(a, k, a.length - 1);
		reverse(a, 0, a.length - 1);

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Printing the original array-------------");
		for (int i = 0; i < a.length; i++) {			
			
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Printing the rotated array-----------");
		rotate(a, 3);
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}

	}

}
