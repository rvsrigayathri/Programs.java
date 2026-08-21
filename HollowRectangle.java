package myprograms;
import java.util.Scanner;
public class HollowRectangle {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int r=a.nextInt();
		int c=a.nextInt();
		HollowRectangle(r,c);
	}
	public static void HollowRectangle(int r,int c) {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==0||i==r-1||j==0||j==c-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
