package myprograms;

import java.util.Scanner;

public class SortingArray {
	
	public static boolean Sorting(int arr[],int size) {
		for(int i=0;i<size-1;i++) {
			if(arr[i]<arr[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int size=a.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=a.nextInt();
		}
		if(Sorting(arr,size)) {
			System.out.print("Sorted Array");
		}
		else {
			System.out.print("Not Sorted Array");
		}
	}

}
