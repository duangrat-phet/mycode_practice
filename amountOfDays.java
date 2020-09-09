package ju;
import java.util.Scanner;


public class amountOfDays {

	public amountOfDays() {
		Scanner s = new Scanner(System.in);

		String str1 = s.nextLine(); //รับค่าสตริง
		String str2 = s.nextLine(); // รับค่าสตริง

		int day1 = amount(str1); // หาจำนวนวันทั้งหมด ตั้งแต่ต้นปี
		int day2 = amount(str2); // หาจำนวนวันทั้งหมด ตั้งแต่ต้นปี

		int result = day2 - day1 + 1; // หาระยะห่างของวัน ที่บวก1 เพราะว่านับวันเริ่มต้นด้วย

		System.out.println(result); //ปริ้นคำตอบ

	}

	public int amount(String str){ // หาจำนวนวันทั้งหมด ตั้งแต่ต้นปี
		int date = Integer.valueOf(str.substring(0, 2)); //ตัดสองตัวแรกจากสตริง แล้วแปลงเป็นจำนวนเต็ม
		String month = str.substring(2,5); // ตัด 3 ตัวที่เหลือออกมา ได้เป็น ชื่อเดือน

		int numMonth = 0; //หาลำดับของเดือน
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

		int result = 0;//จำนวนวันตั้งแต่ต้นปีจนถึงเดือนที่รับค่าเข้ามา
		for (int i = 1; i < numMonth; i++) { //วนลูปหาจำนวนวันตั้งแต่ต้นปีจนถึงเดือนที่รับค่าเข้ามา
			if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
				result += 31;
			} else if ( i==2 ){
				result += 28;
			} else {
				result += 30;
			}
		}

		result += date; //หลังจากได้จำนวนวันตั้งแต่ต้นปีจนถึงเดือนปัจจุบันแล้ว เพิ่มวันที่เข้าไป

		return result;
	}

	public static void main(String[] args) {
		new amountOfDays();
	}
}
