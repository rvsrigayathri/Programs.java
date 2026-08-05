package myprograms;
import java.util.Scanner;
public class HexadecimalToDecimalString {

	public static void HexadecimalToDecimalString(String s) {
		int decimal=0;
		int place=1;
		for(int i=s.length()-1;i>=0;i--) {
			int value=1;
			char ch=s.charAt(i);
			if(ch>='0'&& ch<='9') {
				value=ch-'0';
			}
			else {
				value=ch-'A'+10;
			}
			decimal=decimal+value*place;
			place=place*16;
		}
		System.out.print(decimal);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		HexadecimalToDecimalString(s);
	}
}
