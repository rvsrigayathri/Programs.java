package myprograms;
import java.util.Scanner;
public class AddTwoBinary {

	public static int binarytodecimal(int n) {
		int count=0;
		int pow=1;
		while(n>0) {
			int rem=n%10;
			count=count+rem*pow;
			pow=pow*2;
			n=n/10;
		}
		return count;
	}
	
	public static int decimaltobinary(int n) {
		int count=0;
		int pow=1;
		while(n>0) {
			int rem=n%2;
			count=count+rem*pow;
			pow=pow*10;
			n=n/2;
		}
		return count;
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c= binarytodecimal(a);
		int d= binarytodecimal(b);
		int sum=c+d;
		int ans=decimaltobinary(sum);
		System.out.print(ans);
	}
}
