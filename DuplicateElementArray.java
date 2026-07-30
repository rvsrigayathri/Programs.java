/*package myprograms;
import java.util.Scanner;
public class DuplicateElementArray {

	public static void DuplicateElementArray(int arr[],int size) {
		boolean visit[]=new boolean[size];
		for(int i=0;i<size;i++) {
			if(visit[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
					visit[i]=true;
				}
			}
			if(count>1) {
				System.out.print(arr[i] + " ");
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
		DuplicateElementArray(arr,size);
	}

}



*/

package myprograms;
import java.util.Scanner;
public class DuplicateElementArray {
	
	public static void DuplicateElementArray(int arr[],int size) {
		for(int i=0;i<size;i++) {
			int count=1;
			for(int j=0;j<size;j++) {
				
				if(arr[i]==arr[j]) {
					count=count+1;
				}
			}
			if(count>1) {
				System.out.print(arr[i] + " ");
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
		DuplicateElementArray(arr,size);
	}
}



















