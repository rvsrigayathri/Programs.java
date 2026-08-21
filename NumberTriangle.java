package myprograms;
import java.util.Scanner;
public class NumberTriangle {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		NumberTriangle(n);
	}
	public static void NumberTriangle(int n) {
		int value=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
	}

}
