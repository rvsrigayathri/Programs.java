package myprograms;
import java.util.Scanner;
public class UpperTriangleMatrixSum {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		UpperTriangleMatrixSum(n,arr);
	}
	public static void UpperTriangleMatrixSum(int n,int arr[][]) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.print(sum);
	}

}
