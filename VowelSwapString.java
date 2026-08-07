package myprograms;
import java.util.Scanner;
public class VowelSwapString {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		Swap(s);
	}
	
	public static boolean isVowel(char ch) {
		return ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u';
	}

	public static void Swap(String s) {
			char ch[]=s.toCharArray();
			int start=0;
			int end=ch.length-1;
			while(start<end) {
				while(start<end && (!(isVowel(ch[start])))){
					start++;
				}
				while(start<end && (!(isVowel(ch[end])))) {
					end--;
				}
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
			for(int i=0;i<s.length();i++) {
				System.out.print(ch[i]);
			}
		}
	}
