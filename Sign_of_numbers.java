package myprograms;
import java.util.Scanner;
class Sign_of_numbers {

	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		if(num<0) {
			System.out.println("Negative number");
		}
		else if(num==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Positive number");
		}
	}

}
