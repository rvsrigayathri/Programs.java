package myprograms;
import java.util.Scanner;
public class SumMatrixElements {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				arr[i][j]=a.nextInt();
			}
		}
		SumMatrixElements(n,arr);
	}
	public static void SumMatrixElements(int n,int arr[][]) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.print(sum);
	}

}
