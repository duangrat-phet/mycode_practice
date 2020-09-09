package ju;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Integer[] bit = new Integer[size];

		for (int i = 0; i < bit.length; i++) {
			bit[i] = scan.nextInt();
		}

		String str = "";
		for (int i = 0; i < bit.length; i++) {
			str += bit[i];
		}

		int n10 = Integer.parseInt(str, 2);
		System.out.println(n10);

	}

}
