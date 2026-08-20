package myprograms;
import java.util.Scanner;
public class SumRowElements {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		SumRowElements(n,arr);
	}
	public static void SumRowElements(int n,int arr[][]) {
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}

}
