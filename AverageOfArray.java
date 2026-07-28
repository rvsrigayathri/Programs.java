package myprograms;
import java.util.Scanner;
public class AverageOfArray {

	public static void AverageOfArray(int arr[],int size) {
		int sum=0;
		int avg=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
			avg=sum/size;
		}
		System.out.print(avg);
	}
	
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int size=obj.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
		}
		AverageOfArray(arr,size);
	}

}
