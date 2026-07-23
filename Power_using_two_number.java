package myprograms;
import java.util.Scanner;
public class Power_using_two_number {

	public static void Power(int num1,int num2) {
		int power=1;
		for(int i=1;i<=num2;i++) {
			power=power*num1;
		}
		System.out.println(power);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num1=a.nextInt();
		int num2=a.nextInt();
		Power(num1,num2);
	}
	
	

}
