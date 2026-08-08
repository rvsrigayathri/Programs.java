package myprograms;
import java.util.Scanner;
public class ReplaceVowelsString {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		Replace(s);
	}
	public static void Replace(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				System.out.print("#");
			}
			else {
				System.out.print(ch);
			}
		}
	}
}
