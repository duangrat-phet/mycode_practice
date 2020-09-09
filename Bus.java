package ju;

import java.util.Scanner;

public class Bus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Integer[] H = new Integer[size];
		Integer[] M = new Integer[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			H[i] = scan.nextInt();
			M[i] = scan.nextInt();
		}

		for (int i = 0; i < size - 1; i++) {
			sum = sum + ((H[i + 1] - H[i]) * 60);
			sum = sum + ((M[i + 1] - M[i]));
		}

		sum = sum / (size - 1);

		System.out.println(sum);

	}

}
