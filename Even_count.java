package myprograms;
import java.util.Scanner;
public class Even_count {

	public static void Even(int num,int count) {
		while(num>0) {
			int rem=num%10;
			if(num%2!=0) {
				count=count+1;
			}
			num=num/10;
		}
		System.out.println(count);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int count=0;
		Even(num,count);
	}

}
