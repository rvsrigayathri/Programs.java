package myprograms;
import java.util.Scanner;
public class Divisible_check {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		if(num%5==0 && num%11==0) {
			System.out.println(num + " It is divisible");
		}
		else {
			System.out.println(num + " It is not divisible");
		}
	}
}
