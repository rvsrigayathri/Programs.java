package myprograms;
import java.util.Scanner;
public class MaxRow {
	public static void main(String args[]) {
		java.util.Scanner a=new Scanner(System.in);
		int r=a.nextInt();
		int c=a.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		MaxRow(r,c,arr);
	}
	public static void MaxRow(int r,int c,int arr[][]) {
		for(int i=0;i<r;i++) {
			int max=arr[i][0];
			for(int j=0;j<c;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			System.out.print(max+" ");
		}
	}

}
