package myprograms;
import java.util.Scanner;
public class Transpose {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		Transpose(n,arr);
	}
	public static void Transpose(int n,int arr[][]) {
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
