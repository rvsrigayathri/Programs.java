package myprograms;
import java.util.Scanner;
public class MagicSquareMatrix {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		boolean r=MagicSquareMatrix(n,arr);
		if(r) {
			System.out.print("TRUE");
		}
		else {
			System.out.print("FALSE");
		}
	}
	public static boolean MagicSquareMatrix(int n,int arr[][]) {
		int target=0;
		for(int j=0;j<n;j++) {
			target=target+arr[0][j];
		}
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum=sum+arr[i][j];
			}
			if(sum!=target) {
				return false;
			}
		}
		for(int j=0;j<n;j++) {
			int sum=0;
			for(int i=0;i<n;i++) {
				sum=sum+arr[i][j];
			}
			if(sum!=target) {
				return false;
			}
		}
		int pd=0;
		int sd=0;
		for(int i=0;i<n;i++) {
			pd=pd+arr[i][i];
			sd=sd+arr[i][n-1-i];
		}
		if(pd!=target|| sd!=target) {
			return false;
		}
		return true;
	}

}
