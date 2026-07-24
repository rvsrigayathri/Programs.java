package myprograms;
import java.util.Scanner;
public class Armstrong {

	public static void Armstrong(int num,int sum,int temp) {
		while(temp>0) {
			int rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
	
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int sum=0;
		int temp=num;
		Armstrong(num,sum,temp);
	}

}
