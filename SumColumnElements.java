package myprograms;
import java.util.Scanner;
public class SumColumnElements {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		SumColumnElements(n,arr);
	}
	public static void SumColumnElements(int n,int arr[][]) {
		for(int j=0;j<n;j++) {
			int sum=0;
			for(int i=0;i<n;i++) {
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}

}
