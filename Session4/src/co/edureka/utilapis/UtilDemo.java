package co.edureka.utilapis;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UtilDemo {

	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);
		
		//SimpleDateFormat explore
		
		Calendar calendar =Calendar.getInstance();
		int hr = calendar.get(Calendar.HOUR_OF_DAY);
		int min= calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		System.out.println(hr + ":" + min +":" + sec);
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=scanner.nextInt();
		
		System.out.println("Enter number b:");
		int b=scanner.nextInt();
		int c = a+b;
		System.out.println("C is  " +c);
		
		scanner.close();
	}
	
}
