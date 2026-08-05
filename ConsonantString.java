package myprograms;
import java.util.Scanner;
public class ConsonantString {

	public static void Consonant(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')) {
				System.out.print(ch);
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		Consonant(s);
	}
}
