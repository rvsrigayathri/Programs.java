package myprograms;
import java.util.Scanner;
class Largest_among_three_numbers {

	public static void main(String args[]){
		Scanner num=new Scanner(System.in);
		int a=num.nextInt();
		int b=num.nextInt();
		int c=num.nextInt();
		if(a>b && a>c) {
			System.out.println(a +" is larger than "+ b + " and "+ c);
		}
		else if(b>a && a>c) {
			System.out.println(b +" is larger than "+ a + " and "+ c);
		}
		else {
			System.out.println(c +" is larger than "+ a + " and "+ b);
		}
	}

}
