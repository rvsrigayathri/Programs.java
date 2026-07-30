package myprograms;
import java.util.Scanner;
public class FirstDistinct {

	public static void FirstDistinct(int arr[],int size) {
		for(int i=0;i<size;i++) {
			boolean repeat=false;
			for(int j=0;j<size;j++) {
				if(i!=j && arr[i]==arr[j]) {
					repeat=true;
					break;
				}
			}
			if(!repeat) {
				System.out.print(arr[i]);
				return;
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=a.nextInt();
		}
		FirstDistinct(arr,size);
	}

}
