package myprograms;
import java.util.Scanner;
public class BinaryToOctal {

	public static void BinaryToOctal(int num,int decimal,int octal) {
		int pow1=1;
		while(num>0) {
			int rem=num%10;
			decimal=decimal+rem*pow1;
			pow1=pow1*2;
			num=num/10;
		}
		int pow2=1;
		while(decimal>0) {
			int rem1=decimal%8;
			octal=octal+rem1*pow2;
			pow2=pow2*10;
			decimal=decimal/8;
		}
		
		System.out.println(octal);
	}
	
	
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int decimal=0;
		int octal=0;
		BinaryToOctal(num,decimal,octal);
	}

}
