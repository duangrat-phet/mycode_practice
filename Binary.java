package ju;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n2 = scan.nextInt();
		Integer[] num2 = new Integer[n2];

		for (int i = 0; i < num2.length; i++) {
			num2[i] = scan.nextInt();
		}
		
		int n10 = scan.nextInt();
		
		String str = "";
		for (int i = 0; i < num2.length; i++) {
			str += num2[i];
		}
		
		int a = Integer.parseInt(str , 2);
		int total = a*n10;
		
		String to = Integer.toBinaryString(total);
		
		for (int i = 0; i < to.length(); i++) {
			System.out.println(to.charAt(i)); 
		}

	}

}
