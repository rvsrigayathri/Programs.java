package myprograms;
import java.util.Scanner;
public class SumTotal {

	public static int SumTotal(int arr[],int size) {
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=a.nextInt();
		}
		int total=SumTotal(arr,size);
		if(total%2==0) {
			System.out.println("Sum" + ":" + total);
			System.out.println("Category" + ":" + "Even");
		}
		else {
			System.out.println("Sum" + ":" + total);
			System.out.println("Category" + ":" + "Odd");
		}
	}

}
