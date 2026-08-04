package myprograms;
import java.util.Scanner;
public class Singledigitconversion {

	public static void Singledigitconversion(int num) {
		while(num>=10) {
			int sum=0;
			while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			}
			num=sum;
		}
		System.out.print(num);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		
		Singledigitconversion(num);
	}

}
