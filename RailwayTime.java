package myprograms;
import java.util.Scanner;
public class RailwayTime {
	public static void main(String agrs[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		RailwayTime(s);
	}
	public static void RailwayTime(String s) {
		int hour=(s.charAt(0)-'0')*10+(s.charAt(1)-'0');
		char ampm1=s.charAt(8);
		char ampm2=s.charAt(9);
		if(ampm1=='A'&&ampm2=='M') {
			if(hour==12) {
				hour=0;
			}
		}
		if(ampm1=='P'&&ampm2=='M') {
			if(hour!=12) {
				hour=hour+12;
			}
		}
		if(hour<0) {
			System.out.print("0");
		}
		System.out.print(hour);
		System.out.print(":");
		System.out.print(s.charAt(3));
		System.out.print(s.charAt(4));
		System.out.print(":");
		System.out.print(s.charAt(6));
		System.out.print(s.charAt(7));
	}
}
