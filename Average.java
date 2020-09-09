package ju;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Integer[] num = new Integer[size];
		double sum = 0.0;
		int avg = 0;
		
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		double percent = size*0.30;
		int a = (int) Math.ceil(percent);
		
		for (int i = 0; i < a; i++) {
			sum += num[i];
			
		}
		avg = (int) Math.floor(sum/a);
		System.out.println(avg);
	}

}
