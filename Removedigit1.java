package myprograms;
import java.util.Scanner;
public class Removedigit1 {

	public static void  Removedigit1(int num,int digit) {
		int result=0;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			if(rem!=digit) {
				result=result*10+rem;
			}
			num=num/10;
		}
		while(result>0) {
			int rem=result%10;
			rev=rev*10+rem;
			result=result/10;
		}
		System.out.print(rev);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int digit=a.nextInt();
		Removedigit1(num,digit);
	}
}
