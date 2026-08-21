package myprograms;
import java.util.Scanner;
public class AddTwoMatrix {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int a1[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a1[i][j]=a.nextInt();
			}
		}
		int a2[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a2[i][j]=a.nextInt();
			}
		}
		AddTwoMatrix(n,a1,a2);
	}
	public static void AddTwoMatrix(int n,int a1[][],int a2[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a1[i][j]+a2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
