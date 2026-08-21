package myprograms;
import java.util.Scanner;
public class InvertedTriangle {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		InvertedTriangle(n);
	}
	public static void InvertedTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i*2;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
