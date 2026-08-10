package myprograms;
import java.util.Scanner;
public class WordReverseString {

	public static void  Reverse(String s) {
		String word="";
		for(int i=s.length()-1;i>=0;i--) {
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
		String s=" "+a.nextLine(); 
		Reverse(s);
	}

}
