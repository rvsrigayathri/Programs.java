package myprograms;
import java.util.Scanner;
public class BoundaryElementOfMatrix {
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int r=a.nextInt();
		int c=a.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=a.nextInt();
			}
		}
		BoundaryElementOfMatrix(r,c,arr);
	}
	public static void BoundaryElementOfMatrix(int r,int c,int arr[][]) {
		for(int j=0;j<c;j++) {
			System.out.print(arr[0][j]+" ");
		}
		for(int i=1;i<r;i++) {
			System.out.print(arr[i][c-1]+" ");
		}
		for(int j=c-2;j>=0;j--) {
			System.out.print(arr[r-1][j]+" ");
		}
		for(int i=r-2;i>0;i--) {
			System.out.print(arr[i][0]+" ");
		}
	}

}
