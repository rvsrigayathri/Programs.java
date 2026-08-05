package myprograms;
import java.util.Scanner;
public class NumString {

	public static void  Num(String a) {
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>='0'&&ch<='9') {
			System.out.print(ch);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		Num(a);
	}

}
