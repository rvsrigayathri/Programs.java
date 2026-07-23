package myprograms;
import java.util.Scanner;
class Larger {

	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		int a=num.nextInt();
		int b=num.nextInt();
		if(a>b) {
			System.out.println(a +" is larger than "+ b);
		}
		else {
			System.out.println(b +" is larger than "+ a);
		}
	}

}
