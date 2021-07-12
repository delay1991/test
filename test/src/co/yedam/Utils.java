package co.yedam;

import java.util.Scanner;

public class Utils {
	static Scanner s = new Scanner(System.in);

	public static String scanString(String arg) {
		System.out.println(arg);
		String val = s.nextLine();
		return val;
	}
	public static String scanNumberString(String arg) {
		String val="";
		while(true) {
			System.out.println(arg);
			val=s.nextLine();
			try {
				Integer.parseInt(val);
				break;
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요");
			}
		}
		return val;
	}
}
