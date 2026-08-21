package myprograms;
import java.util.Scanner;
public class RightAngleTriangle {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		RightAngleTriangle(n);
	}
	public static void RightAngleTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
