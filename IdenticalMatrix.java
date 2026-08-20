package myprograms;
import java.util.Scanner;
public class IdenticalMatrix {
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
		boolean r=IdenticalMatrix(n,a1,a2);
		if(r) {
			System.out.print("YES");
		}
		else {
			System.out.print("FALSE");
		}
	}
	public static boolean IdenticalMatrix(int n,int a1[][],int a2[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a1[i][j]!=a2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
