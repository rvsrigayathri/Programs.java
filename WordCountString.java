package myprograms;
import java.util.Scanner;
public class WordCountString {

	public static void WordCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) {
				count++;
			}
		}
		System.out.print(count);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		WordCount(s);
	}
}
