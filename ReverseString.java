package myprograms;
import java.util.Scanner;
public class ReverseString {

	public static void ReverseString(String s) {
		char[] ch=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		System.out.print(ch);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		ReverseString(s);
	}
}
