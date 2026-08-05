package myprograms;
import java.util.Scanner;
public class RemoveSpace {

	public static void RemoveSpace(String s) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				System.out.print(ch);
			}
		}
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		RemoveSpace(s);
	}
}
