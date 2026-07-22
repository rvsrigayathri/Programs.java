package myprograms;
import java.util.Scanner;
public class Odd {
	
	public static void Oddnum(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		Oddnum(num);
	}

}
