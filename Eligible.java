package myprograms;
import java.util.Scanner;
class Eligible {
	public static void main (String args[]) {
		Scanner a=new Scanner(System.in);
		int age=a.nextInt();
		if(age>=18) {
			System.out.print("Eligible to vote");
		}
		else {
			System.out.print("Not eligible to vote");
		}
	}
}
