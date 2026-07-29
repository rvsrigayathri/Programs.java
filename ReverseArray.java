package myprograms;
import java.util.Scanner;
public class ReverseArray {

	public static void ReverseArray(int arr[],int size) {
		for(int i=0 , j=size-1; i<j; i++ , j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=a.nextInt();
		}
		ReverseArray(arr,size);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
