package myprograms;
import java.util.Scanner;
public class DecimalToHexadecimal {

	public static void DecimalToHexadecimal(int num) {
		String hexa="";
		while(num>0) {
			int rem=num%16;
			if(rem<10) {
				hexa=rem+hexa;
			}
			else {
				char ch=(char)('A'+(rem-10));
				hexa=ch+hexa;
			}
			num=num/16;
		}
		System.out.print(hexa);
	}
	public static void main (String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		DecimalToHexadecimal(num);
	}

}
