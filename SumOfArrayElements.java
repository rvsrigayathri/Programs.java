package myprograms;
import java.util.Scanner;
public class SumOfArrayElements {

	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.print(sum);
	}
}
