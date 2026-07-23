package myprograms;
import java.util.Scanner;
public class Odd_digit_print {

	public static void Odd(int num) {
		while(num>0) {
			int rem=num%10;
			if(rem%2!=0) {
				System.out.println(rem);
			}
			num=num/10;
		}
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		
		Odd(num);
	}

}
