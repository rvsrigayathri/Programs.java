package myprograms;
import java.util.Scanner;
public class Palindrome {

	public static void Palin_num(int num) {
		int rem=0;
		int rev=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.print(rev);
	}
	public static void main(String args[]) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		Palin_num(num);
	}

}

/*
 import java.util.Scanner;
 public class Palindrome{
 public static void main(String args[]){
 	Scanner a=new Scanner(System.in);
 	int num=a.nextInt();
 	int rev=0;
 	while(num>0){
 		int rem=num%10;
 		rev = rev*10+rem;
 		num=num/10;
 	}
 	System.out.println(rev);
 }
 }	
 */
