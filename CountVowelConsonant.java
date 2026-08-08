package myprograms;
import java.util.Scanner;
public class CountVowelConsonant {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		Count(s);
	}
	public static void Count(String s) {
		int vow=0;
		int con=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='U'||ch=='u'||ch=='O'||ch=='o') {
				vow++;
			}
			if(!(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')) {
					con++;
				}
			
			}
		}
		System.out.println(vow);
		System.out.println(con);
	}

}
