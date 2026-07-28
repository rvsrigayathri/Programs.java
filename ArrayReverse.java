package myprograms;
import java.util.Scanner;
public class ArrayReverse {
	
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
