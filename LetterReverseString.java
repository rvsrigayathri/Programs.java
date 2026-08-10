package myprograms;
import java.util.Scanner;
public class LetterReverseString {

	public static void reverse(String s){
		String word="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				word=s.charAt(i)+word;
			}
			else {
				if(word.length()>0) {
					System.out.print(word+" ");
				}
				word="";
			}
		}
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine()+" ";
		reverse(s);
	}
}
