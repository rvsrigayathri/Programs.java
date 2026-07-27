package myprograms;
import java.util.Scanner;
public class BinarytoDecimal {

	public static void Decimal(int num,int count) {
		int pow=1;
		while(num>0) {
			int rem=num%10;
			count=count+rem*pow;
			pow=pow*2;
			num=num/10;
		}
		System.out.println(count);
	}
	
	public BinarytoDecimal() {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int count=0;
		Decimal(num,count);
	}

}
