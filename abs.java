package ju;

import java.util.Scanner;

public class abs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		int abs = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < num.length ; i++){
			num[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i < num.length ; i++){
			for(int j = i+1 ; j < num.length ; j++){
				abs = Math.abs(num[i]- num[j]);
				if(abs < min){
					min = abs;
				}
			}
		}
		System.out.println(min);

	}

}
