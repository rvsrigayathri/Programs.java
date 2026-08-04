package myprograms;
import java.util.Scanner;
public class Armstrong1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		Armstrong1(num);
	}
	public static void Armstrong1(int num) {
		int temp1=num;
		int totaldigits=0;
		while(temp1>0) {
			totaldigits++;
			temp1=temp1/10;
		}
		int temp2=num;
		int totalsum=0;
		while(temp2>0) {
			int lastdigit=temp2%10;
			int power=1;
			for(int i=1;i<=totaldigits;i++) {
				power =power*lastdigit;
			}
			totalsum=totalsum+power;
			temp2=temp2/10;
		}
		if(totalsum==num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
