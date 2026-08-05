package myprograms;
import java.util.Scanner;
public class VowelCountString {

	public static void Vowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				count++;
			}
		}
		System.out.print(count);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		Vowels(s);
	}
}
