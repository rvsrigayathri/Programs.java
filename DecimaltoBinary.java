package myprograms;
import java.util.Scanner;
public class DecimaltoBinary {
	
	public static void Binary(int num,int count) {
		int pow=1;
		while(num>0) {
			int rem=num%2;
			count=count+rem*pow;
			pow=pow*10;
			num=num/10;
		}
		System.out.println(count);
	}

	public DecimaltoBinary() {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int count=0;
		Binary(num,count);
	}

}
