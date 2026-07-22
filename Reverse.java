package myprograms;
import java.util.Scanner;
public class Reverse {
	
	public static void Revnum(int num) {
		for(int i=num;i>0;i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		Revnum(num);
	}
	

}
