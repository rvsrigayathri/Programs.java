package myprograms;
import java.util.Scanner;
public class General_pattern {

	public static void General_pattern(int n) {
		for(int i=n;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		General_pattern(n);
	}
}
