package myprograms;
import java.util.Scanner;
public class CharLineByLine {

	public static void  CharLineByLine(String a) {
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		CharLineByLine(a);
	}

}
