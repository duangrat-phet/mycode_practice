package ju;
import java.util.Scanner;


public class amountOfDays {

	public amountOfDays() {
		Scanner s = new Scanner(System.in);

		String str1 = s.nextLine(); //�Ѻ���ʵ�ԧ
		String str2 = s.nextLine(); // �Ѻ���ʵ�ԧ

		int day1 = amount(str1); // �Ҩӹǹ�ѹ������ �����鹻�
		int day2 = amount(str2); // �Ҩӹǹ�ѹ������ �����鹻�

		int result = day2 - day1 + 1; // ��������ҧ�ͧ�ѹ ���ǡ1 ������ҹѺ�ѹ������鹴���

		System.out.println(result); //���鹤ӵͺ

	}

	public int amount(String str){ // �Ҩӹǹ�ѹ������ �����鹻�
		int date = Integer.valueOf(str.substring(0, 2)); //�Ѵ�ͧ����á�ҡʵ�ԧ �����ŧ�繨ӹǹ���
		String month = str.substring(2,5); // �Ѵ 3 ��Ƿ��������͡�� ���� ������͹

		int numMonth = 0; //���ӴѺ�ͧ��͹
		if(month.equals("JAN")){
			numMonth = 1;
		} else if(month.equals("FEB")){
			numMonth = 2;
		} else if(month.equals("MAR")){
			numMonth = 3;
		} else if(month.equals("APR")){
			numMonth = 4;
		} else if(month.equals("MAY")){
			numMonth = 5;
		} else if(month.equals("JUN")){
			numMonth = 6;
		} else if(month.equals("JUL")){
			numMonth = 7;
		} else if(month.equals("AUG")){
			numMonth = 8;
		} else if(month.equals("SEP")){
			numMonth = 9;
		} else if(month.equals("OCT")){
			numMonth = 10;
		} else if(month.equals("NOV")){
			numMonth = 11;
		} else if(month.equals("DEC")){
			numMonth = 12;
		}

		int result = 0;//�ӹǹ�ѹ�����鹻ը��֧��͹����Ѻ��������
		for (int i = 1; i < numMonth; i++) { //ǹ�ٻ�Ҩӹǹ�ѹ�����鹻ը��֧��͹����Ѻ��������
			if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
				result += 31;
			} else if ( i==2 ){
				result += 28;
			} else {
				result += 30;
			}
		}

		result += date; //��ѧ�ҡ��ӹǹ�ѹ�����鹻ը��֧��͹�Ѩ�غѹ���� �����ѹ�������

		return result;
	}

	public static void main(String[] args) {
		new amountOfDays();
	}
}
