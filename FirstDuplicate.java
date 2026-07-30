package myprograms;
import java.util.Scanner;
public class FirstDuplicate {

	public static void FirstDuplicate(int arr[],int size) {
		for(int i=0;i<size;i++) {
			boolean repeat=false;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]);
					repeat=true;
					break;
				}
			}
			if(repeat) {
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
		FirstDuplicate(arr,size);
	}

}
