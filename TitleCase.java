package myprograms;
import java.util.Scanner;
public class TitleCase {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		Title(s);
	}
	public static void Title(String s) {
		String result="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i==0||s.charAt(i-1)==' ') {
				if(ch>='a' && ch<='z') {
					ch=(char)(ch-32);
				}
			}
			else {
				if(ch>='A' && ch<='Z') {
					ch=(char)(ch+32);
				}
			}
			result=result+ch;
		}
		System.out.print(result);
	}
}
