package myprograms;
import java.util.Scanner;
public class DiagonalDiffer {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		int result=DiagonalDiffer(n,arr);
		System.out.print(result);
	}
	public  static int DiagonalDiffer(int n,int arr[][]) {
		int pd=0;
		int sd=0;
		for(int i=0;i<n;i++) {
			pd=pd+arr[i][i];
			sd=sd+arr[i][n-1-i];
		}
		int differ=pd-sd;
		if(differ<0) {
			return differ*-1;
		}
		else {
			return differ;
		}
	}

}
