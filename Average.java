package myprograms;
import java.util.Scanner;
class Average {

	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num1=a.nextInt();
		int num2=a.nextInt();
		int num3=a.nextInt();
		int num4=a.nextInt();
		float avg=(num1+num2+num3+num4)/4;   /*int num = num1+num2+num3+num4;    avg=num/4; */
		System.out.println(avg);
	}

}
