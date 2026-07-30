package myprograms;
import java.util.Scanner;
public class PalindromeJava {

	public static boolean check(int arr[],int size) {
		for(int i=0 , j=size-1 ;i<j; i++ ,j--) {
			if(arr[i]!=arr[j]) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=a.nextInt();
		}
		if(check(arr,size)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
